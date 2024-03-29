package com.square.tech.safeblooddonors.ui.userdetail.presenter;

import com.google.firebase.auth.FirebaseAuth;
import com.google.gson.Gson;
import com.square.tech.safeblooddonors.constants.SharedPrefConstants;
import com.square.tech.safeblooddonors.data.model.User;
import com.square.tech.safeblooddonors.data.source.DonationDataSource;
import com.square.tech.safeblooddonors.storage.SharedPreferenceManager;
import com.square.tech.safeblooddonors.ui.userdetail.UserDetailContract;
import com.square.tech.safeblooddonors.ui.userdetail.model.UserDetail;
import com.square.tech.safeblooddonors.util.Util;

/**
 * Created by riteshksingh on Apr, 2018
 */
public class UserDetailPresenter implements UserDetailContract.Presenter {

    private final UserDetailContract.View mView;
    private final FirebaseAuth mFirebaseAuth;
    private final DonationDataSource mDataRepo;
    private final SharedPreferenceManager mSharedPreferenceManager;

    public UserDetailPresenter(UserDetailContract.View view, FirebaseAuth firebaseAuth,
                               SharedPreferenceManager sharedPreference, DonationDataSource dataRepo) {
        mFirebaseAuth = firebaseAuth;
        mSharedPreferenceManager = sharedPreference;
        mView = view;
        mDataRepo = dataRepo;
    }

    @Override
    public void onCreate() {
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onCreateNowClick(UserDetail userDetail) {
        User user = Util.getPreparedUser(userDetail);
        int isValid = Util.isValidUser(user);
        if (isValid == 0) {
            mDataRepo.saveNewUser(mFirebaseAuth.getCurrentUser().getUid(),
                    user);
            mSharedPreferenceManager.put(SharedPrefConstants.IS_USER_DETAILS_ENTERED, true);
            mSharedPreferenceManager.put(SharedPrefConstants.USER_DETAILS, new Gson().toJson(user));
            mView.launchHomeScreen();
        } else mView.generalResponse(isValid);

    }

    @Override
    public void onDobButtonClick() {
        mView.showDatePickerDialog();
    }

    @Override
    public void onLocationClick() {
        mView.getLastLocation();
    }


}
