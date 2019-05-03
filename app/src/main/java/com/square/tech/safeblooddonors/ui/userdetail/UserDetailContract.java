package com.square.tech.safeblooddonors.ui.userdetail;

import com.square.tech.safeblooddonors.base.BasePresenter;
import com.square.tech.safeblooddonors.base.BaseView;
import com.square.tech.safeblooddonors.ui.userdetail.model.UserDetail;

/**
 * Created by riteshksingh on Apr, 2018
 */
public interface UserDetailContract {
    interface Presenter extends BasePresenter {
        void onCreateNowClick(UserDetail userDetail);

        void onDobButtonClick();

        void onLocationClick();
    }

    interface View extends BaseView {
        void showDatePickerDialog();

        void getLastLocation();

        void launchHomeScreen();

    }
}
