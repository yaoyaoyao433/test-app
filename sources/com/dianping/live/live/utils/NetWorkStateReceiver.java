package com.dianping.live.live.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NetWorkStateReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;
    private a b;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i);
    }

    public NetWorkStateReceiver(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0d08dc02c0f05070b4b985403bea477", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0d08dc02c0f05070b4b985403bea477");
        } else {
            this.b = aVar;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NetworkInfo networkInfo;
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29969a6a823212463c4a42bf1961b46f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29969a6a823212463c4a42bf1961b46f");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 21) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
                NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(0);
                if ((networkInfo2 != null && networkInfo2.isConnected()) || (networkInfo3 != null && networkInfo3.isConnected())) {
                    this.b.a(1);
                    return;
                } else {
                    this.b.a(0);
                    return;
                }
            }
            ConnectivityManager connectivityManager2 = (ConnectivityManager) context.getSystemService("connectivity");
            Network[] allNetworks = connectivityManager2.getAllNetworks();
            if (allNetworks != null && allNetworks.length > 0) {
                for (Network network : allNetworks) {
                    if (network != null && (networkInfo = connectivityManager2.getNetworkInfo(network)) != null && networkInfo.isConnected()) {
                        this.b.a(1);
                        return;
                    }
                }
            }
            this.b.a(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
