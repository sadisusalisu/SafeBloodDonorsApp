package com.square.tech.safeblooddonors.ui.home;

import android.support.annotation.NonNull;

import com.square.tech.safeblooddonors.base.BasePresenter;
import com.square.tech.safeblooddonors.data.model.ReceiverDonorRequestType;
import com.square.tech.safeblooddonors.ui.home.model.RequestDetails;

/**
 * Created by riteshksingh on Apr, 2018
 */
public interface RequestDialogContract {
  interface View {
    void getLastLocation();

    void dismissDialog(@NonNull String userId, boolean isReceiver, ReceiverDonorRequestType receiverDonorRequestType);
  }

  interface Presenter extends BasePresenter {

    void onSubmitButtonClick(RequestDetails requestDetails);

    void onLocationClick();
  }
}
