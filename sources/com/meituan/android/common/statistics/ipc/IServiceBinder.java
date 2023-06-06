package com.meituan.android.common.statistics.ipc;

import android.os.IInterface;
import android.os.RemoteException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IServiceBinder extends IInterface {
    public static final int CODE_WIDE_ROUTER = 3;

    DataResponse sendData(DataRequest dataRequest) throws RemoteException;
}
