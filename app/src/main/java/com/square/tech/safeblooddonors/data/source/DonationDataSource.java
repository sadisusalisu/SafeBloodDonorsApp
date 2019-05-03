package com.square.tech.safeblooddonors.data.source;

import com.square.tech.safeblooddonors.data.model.ReceiverDonorRequestType;
import com.square.tech.safeblooddonors.data.model.User;

/**
 * Created by riteshksingh on Apr, 2018
 */
public interface DonationDataSource {
  void saveNewUser(String userId, User user);

  void saveReceiverDetails(String userId, ReceiverDonorRequestType receiverDonorRequestType);

  void saveDonorDetails(String userId, ReceiverDonorRequestType receiverDonorRequestType);
}
