package com.meituan.android.legwork.common.im;

import android.text.TextUtils;
import com.meituan.android.legwork.bean.im.IMInitializeData;
import com.meituan.android.legwork.bean.im.OrderAddressView;
import com.meituan.android.legwork.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a = null;
    public static int e = 1;
    public static int f = 2;
    private static int l;
    private static g m = new g();
    public String b;
    public boolean c;
    public OrderAddressView d;
    private boolean g;
    private boolean h;
    private String i;
    private Map<String, Object> j;
    private List<String> k;

    public static g a() {
        return m;
    }

    public final void a(IMInitializeData iMInitializeData) {
        boolean z = false;
        Object[] objArr = {iMInitializeData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "535ace56759589d0dcc012ff719f698a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "535ace56759589d0dcc012ff719f698a");
            return;
        }
        if (iMInitializeData == null) {
            int i = l - 1;
            l = i;
            if (i > 0) {
                return;
            }
        }
        this.b = "";
        this.h = false;
        this.g = false;
        this.c = false;
        this.d = null;
        this.i = "";
        if (this.j != null) {
            this.j.clear();
        }
        if (this.k != null) {
            this.k.clear();
        }
        if (iMInitializeData != null) {
            l++;
            this.b = iMInitializeData.orderId;
            this.i = iMInitializeData.notSupportSendLocationToast;
            this.h = (iMInitializeData.funcConf == null || !iMInitializeData.funcConf.contains(4)) ? true : true;
            this.g = true ^ iMInitializeData.peerSendReceiptLocationSupport;
            this.d = iMInitializeData.recipientAddress;
            if (this.j == null) {
                this.j = new HashMap();
            }
            this.j.put("businessType", Integer.valueOf(iMInitializeData.businessType));
            this.j.put("order_id", iMInitializeData.orderId);
            this.j.put("order_status", Integer.valueOf(iMInitializeData.orderStatus));
        }
    }

    public final boolean a(boolean z) {
        String str;
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe343aa88a33667e74da1adf27bc28a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe343aa88a33667e74da1adf27bc28a5")).booleanValue();
        }
        z2 = (this.h || this.g || this.c) ? false : false;
        if (!z2 && z) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91895c41a77b52b68c2b779bda46d9ae", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91895c41a77b52b68c2b779bda46d9ae");
            } else if (this.c) {
                str = "订单已结束，暂不支持发送位置";
            } else if (this.h || !this.g) {
                str = "抱歉，因系统原因暂时无法发送位置";
            } else {
                str = !TextUtils.isEmpty(this.i) ? this.i : "对方版本较低，暂不支持接收位置";
            }
            ab.a(str);
        }
        return z2;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "011d52ddef0f271dc0ffe0e6e5d3b3e7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "011d52ddef0f271dc0ffe0e6e5d3b3e7")).booleanValue() : a(true);
    }

    public final Map<String, Object> a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9b27f76852ecf2a0ccc5e7dfa844aab", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9b27f76852ecf2a0ccc5e7dfa844aab");
        }
        if (this.j == null) {
            this.j = new HashMap();
        }
        this.j.put("address_type_paotui", Integer.valueOf(i));
        return this.j;
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be65a70e2cb64f68f77f9b3e568f739f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be65a70e2cb64f68f77f9b3e568f739f")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (this.k == null || !this.k.contains(str)) {
            if (this.k == null) {
                this.k = new ArrayList();
            }
            this.k.add(str);
            return false;
        }
        return true;
    }
}
