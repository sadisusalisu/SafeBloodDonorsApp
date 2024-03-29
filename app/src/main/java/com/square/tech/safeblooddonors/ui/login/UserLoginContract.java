package com.square.tech.safeblooddonors.ui.login;

import com.square.tech.safeblooddonors.base.BasePresenter;
import com.square.tech.safeblooddonors.base.BaseView;

/**
 * Created by riteshksingh on Apr, 2018
 */
public interface UserLoginContract {
  interface Presenter extends BasePresenter {

    void onProceedButtonClick(String phoneNumber, String phoneCode);

    void onVerifyOtpButtonClick(String otp);

    void onResendCodeButtonClick();

    void onEditPhoneNumberClick();

    void onEditPhoneNumberActionYes();
  }

  interface View extends BaseView {

    void launchHomeScreen();

    void launchUserDetailsScreen();

    void setProceedProgressVisibility(boolean isVisible);

    void setVerifyProgressVisibility(boolean isVisible);

    void showPhoneNumberLayout();

    void showVerifyOtpLayout();

    void setResendButtonEnabled(boolean isEnabled);

    void setResendButtonTimerCount(long secondsRemaining);

    void setVerifyScreenPhoneNumber(String phoneNumber);

    void showEditPhoneDialog();
  }
}
