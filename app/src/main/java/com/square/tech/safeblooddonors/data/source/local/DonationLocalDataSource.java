package com.square.tech.safeblooddonors.data.source.local;

import com.square.tech.safeblooddonors.data.model.ReceiverDonorRequestType;
import com.square.tech.safeblooddonors.data.model.User;
import com.square.tech.safeblooddonors.data.source.DonationDataSource;

/**
 * Created by riteshksingh on Apr, 2018
 */
public class DonationLocalDataSource implements DonationDataSource {

    private static DonationLocalDataSource INSTANCE;

    private DonationLocalDataSource() {
    }

    public static DonationDataSource getInstance() {
        if (INSTANCE == null) {
            synchronized (DonationLocalDataSource.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DonationLocalDataSource();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void saveNewUser(String userId, User user) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public void saveReceiverDetails(String userId, ReceiverDonorRequestType receiverDonorRequestType) {

    }

    @Override
    public void saveDonorDetails(String userId, ReceiverDonorRequestType receiverDonorRequestType) {

    }
}
