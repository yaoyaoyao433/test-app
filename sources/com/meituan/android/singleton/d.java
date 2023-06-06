package com.meituan.android.singleton;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.apache.http.client.HttpClient;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private static HttpClient b;

        static {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            b = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9d54e72ce08d849a6a8d6b2b208e50b", RobustBitConfig.DEFAULT_VALUE) ? (HttpClient) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9d54e72ce08d849a6a8d6b2b208e50b") : new h(i.a("defaultokhttp"));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        private static HttpClient b;

        static {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            b = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51af886fa38059d64088690fc1d432f8", RobustBitConfig.DEFAULT_VALUE) ? (HttpClient) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51af886fa38059d64088690fc1d432f8") : new h(i.a("uuid"));
        }
    }
}
