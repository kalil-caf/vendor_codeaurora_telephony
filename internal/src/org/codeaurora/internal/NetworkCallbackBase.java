/*
 * Copyright (c) 2018, The Linux Foundation. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 *       copyright notice, this list of conditions and the following
 *       disclaimer in the documentation and/or other materials provided
 *       with the distribution.
 *     * Neither the name of The Linux Foundation nor the names of its
 *       contributors may be used to endorse or promote products derived
 *       from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
 * BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
 * IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package org.codeaurora.internal;

import android.os.RemoteException;
import android.util.Log;
import org.codeaurora.internal.INetworkCallback;
import org.codeaurora.internal.SignalStrength;
import org.codeaurora.internal.DcParam;
import org.codeaurora.internal.Status;
import org.codeaurora.internal.Token;
import org.codeaurora.internal.NrConfigType;
import org.codeaurora.internal.BearerAllocationStatus;
import org.codeaurora.internal.UpperLayerIndInfo;

public class NetworkCallbackBase extends INetworkCallback.Stub {
    private static final String TAG = "NetworkCallbackBase";

    @Override
    public void on5gStatus(int slotId, Token token, Status status, boolean enableStatus) throws
            RemoteException {
        Log.d(TAG, "on5gStatus: slotId = " + slotId + " token = " + token + " status" +
                status + " enableStatus = " + enableStatus);
    }

    @Override
    public void onNrDcParam(int slotId, Token token, Status status, DcParam dcParam) throws
            RemoteException {
        Log.d(TAG, "onNrDcParam: slotId = " + slotId + " token = " + token + " status" +
                status + " dcParam = " + dcParam);
    }

    @Override
    public void onSignalStrength(int slotId, Token token, Status status, SignalStrength
            signalStrength) throws RemoteException {
        Log.d(TAG,
                "onSignalStrength: slotId = " + slotId + " token = " + token + " " + "status"
                        + status + " signalStrength = " + signalStrength);
    }

    @Override
    public void onAnyNrBearerAllocation(int slotId, Token token, Status status,
            BearerAllocationStatus bearerStatus) throws RemoteException {
        Log.d(TAG,
                "onNrBearerAllocationChange: slotId = " + slotId + " token = " + token + " " +
                        "status" + status + " bearerStatus = " + bearerStatus);
    }

    @Override
    public void onUpperLayerIndInfo(int slotId, Token token, Status status,
            UpperLayerIndInfo uilInfo) throws RemoteException {
        Log.d(TAG,
                "onUpperLayerIndInfo: slotId = " + slotId + " token = " + token + " " +
                        "status" + status + " UpperLayerIndInfo = " + uilInfo);
    }

    @Override
    public void on5gConfigInfo(int slotId, Token token, Status status, NrConfigType
            nrConfigType) throws RemoteException {
        Log.d(TAG,
                "on5gConfigInfo: slotId = " + slotId + " token = " + token + " " + "status"
                        + status + " NrConfigType = " + nrConfigType);
    }
}
