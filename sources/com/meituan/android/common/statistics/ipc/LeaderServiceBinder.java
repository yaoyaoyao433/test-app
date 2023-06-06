package com.meituan.android.common.statistics.ipc;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.cat.CatMonitorManager;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LeaderServiceBinder extends Binder implements IServiceBinder {
    private static final String DESCRIPTOR = "com.meituan.android.common.statistics.ipc.LeaderServiceBinder";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mContext;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public LeaderServiceBinder(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b99a2dab9cd230b890c53eb2ac240f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b99a2dab9cd230b890c53eb2ac240f6");
            return;
        }
        this.mContext = context;
        attachInterface(this, DESCRIPTOR);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Object[] objArr = {Integer.valueOf(i), parcel, parcel2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08247828cea94542d3225331055fbdff", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08247828cea94542d3225331055fbdff")).booleanValue();
        }
        if (i == 3) {
            parcel.enforceInterface(DESCRIPTOR);
            parcel.readException();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            DataResponse sendData = sendData(DataRequest.CREATOR.createFromParcel(parcel));
            CatMonitorManager.getInstance().reportConnectionSendDuration(i, (int) (SystemClock.elapsedRealtime() - elapsedRealtime), ProcessUtils.getCurrentProcessName(Statistics.getContext()));
            parcel2.writeNoException();
            sendData.writeToParcel(parcel2, 1);
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    @Override // com.meituan.android.common.statistics.ipc.IServiceBinder
    public DataResponse sendData(DataRequest dataRequest) {
        Object[] objArr = {dataRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9c39deaab752b11ba1d89a590096e86", 6917529027641081856L)) {
            return (DataResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9c39deaab752b11ba1d89a590096e86");
        }
        try {
            return RequestDispatcher.getInstance().dispatchRequest(this.mContext, dataRequest);
        } catch (Exception e) {
            LogUtil.log("LeaderServiceBinder sendData error:" + e.getMessage());
            e.printStackTrace();
            return DataResponse.error(e.getMessage());
        }
    }

    public static IServiceBinder asInterface(IBinder iBinder) {
        Object[] objArr = {iBinder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "109c9060039fada1126b46dd03ba261a", 6917529027641081856L)) {
            return (IServiceBinder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "109c9060039fada1126b46dd03ba261a");
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
        if (queryLocalInterface != null) {
            return (IServiceBinder) queryLocalInterface;
        }
        return new LeaderServiceProxy(iBinder);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class LeaderServiceProxy implements IServiceBinder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private IBinder mRemote;

        public LeaderServiceProxy(IBinder iBinder) {
            Object[] objArr = {iBinder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2c37a5a84ed16486755741239ce339a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2c37a5a84ed16486755741239ce339a");
            } else {
                this.mRemote = iBinder;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
        @Override // com.meituan.android.common.statistics.ipc.IServiceBinder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.meituan.android.common.statistics.ipc.DataResponse sendData(com.meituan.android.common.statistics.ipc.DataRequest r13) throws android.os.RemoteException {
            /*
                r12 = this;
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r8 = 0
                r0[r8] = r13
                com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.statistics.ipc.LeaderServiceBinder.LeaderServiceProxy.changeQuickRedirect
                java.lang.String r10 = "d8f7c12ec9e9616d8a30dedcc4d7fe3d"
                r4 = 0
                r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                r1 = r0
                r2 = r12
                r3 = r9
                r5 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L1e
                java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r9, r8, r10)
                com.meituan.android.common.statistics.ipc.DataResponse r13 = (com.meituan.android.common.statistics.ipc.DataResponse) r13
                return r13
            L1e:
                r0 = 0
                android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
                android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
                java.lang.String r3 = com.meituan.android.common.statistics.ipc.LeaderServiceBinder.access$000()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                r1.writeInterfaceToken(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                r1.writeNoException()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                r13.writeToParcel(r1, r8)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                java.lang.String r4 = "remote LeaderServiceProxy sendData; request:"
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                r3.append(r13)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                java.lang.String r13 = r3.toString()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                com.meituan.android.common.statistics.utils.LogUtil.log(r13)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                android.os.IBinder r13 = r12.mRemote     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                r3 = 3
                r13.transact(r3, r1, r2, r8)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                r2.readException()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                android.os.Parcelable$Creator<com.meituan.android.common.statistics.ipc.DataResponse> r13 = com.meituan.android.common.statistics.ipc.DataResponse.CREATOR     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                java.lang.Object r13 = r13.createFromParcel(r2)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                com.meituan.android.common.statistics.ipc.DataResponse r13 = (com.meituan.android.common.statistics.ipc.DataResponse) r13     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
                if (r13 == 0) goto L78
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L83
                java.lang.String r3 = " LeaderServiceProxy sendData; response:"
                r0.<init>(r3)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L83
                java.lang.String r3 = r13.toString()     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L83
                r0.append(r3)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L83
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L83
                com.meituan.android.common.statistics.utils.LogUtil.log(r0)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L83
                goto L78
            L73:
                r0 = move-exception
                r11 = r1
                r1 = r13
                r13 = r0
                goto L88
            L78:
                if (r1 == 0) goto L7d
                r1.recycle()
            L7d:
                if (r2 == 0) goto Lab
                r2.recycle()
                goto Lab
            L83:
                r13 = move-exception
                goto Lae
            L85:
                r13 = move-exception
                r11 = r1
                r1 = r0
            L88:
                r0 = r11
                goto L99
            L8a:
                r13 = move-exception
                r2 = r0
                goto Lae
            L8d:
                r13 = move-exception
                r2 = r0
                r0 = r1
                r1 = r2
                goto L99
            L92:
                r13 = move-exception
                r1 = r0
                r2 = r1
                goto Lae
            L96:
                r13 = move-exception
                r1 = r0
                r2 = r1
            L99:
                java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Lac
                com.meituan.android.common.statistics.utils.LogUtil.log(r13)     // Catch: java.lang.Throwable -> Lac
                if (r0 == 0) goto La5
                r0.recycle()
            La5:
                if (r2 == 0) goto Laa
                r2.recycle()
            Laa:
                r13 = r1
            Lab:
                return r13
            Lac:
                r13 = move-exception
                r1 = r0
            Lae:
                if (r1 == 0) goto Lb3
                r1.recycle()
            Lb3:
                if (r2 == 0) goto Lb8
                r2.recycle()
            Lb8:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.ipc.LeaderServiceBinder.LeaderServiceProxy.sendData(com.meituan.android.common.statistics.ipc.DataRequest):com.meituan.android.common.statistics.ipc.DataResponse");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.mRemote;
        }
    }
}
