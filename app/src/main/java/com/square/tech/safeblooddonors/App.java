package com.square.tech.safeblooddonors;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;
import com.square.tech.safeblooddonors.util.timber.ReleaseTree;
import timber.log.Timber;

/**
 * Created by riteshksingh on Apr, 2018
 */
public class App extends Application {

  private static App INSTANCE;

  public static App getInstance() {
    return INSTANCE;
  }

  @Override public void onCreate() {
    super.onCreate();

    INSTANCE = this;
    initLeakCanary();

    if (BuildConfig.DEBUG) {
      initTimberDebug();
    } else {
      // Release mode
      // Crashlytics.start() // init crashlib
      initTimberRelease();
    }
  }

  private void initTimberDebug() {
    Timber.plant(new Timber.DebugTree() {
      // Adding the linenumber to the tag
      @Override protected String createStackElementTag(StackTraceElement element) {
        return super.createStackElementTag(element) + ":" + element.getLineNumber();
      }
    });
  }

  private void initTimberRelease() {
    Timber.plant(new ReleaseTree());
  }

  private void initLeakCanary() {
    if (LeakCanary.isInAnalyzerProcess(this)) return;

    LeakCanary.install(this);
  }
}
