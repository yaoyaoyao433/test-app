package com.meituan.android.common.locate.ble;

import android.os.Build;
import android.support.annotation.NonNull;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import org.json.JSONArray;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: com.meituan.android.common.locate.ble.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0209a {
        private static final a a = new a();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public a() {
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7d2e74da1c0b9cc62bb3d4fe2cc40f14", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7d2e74da1c0b9cc62bb3d4fe2cc40f14") : C0209a.a;
    }

    public synchronized JSONArray a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16671e5f778680c5bc93cdc42cfa0c91", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16671e5f778680c5bc93cdc42cfa0c91");
        }
        return a(str, com.meituan.android.common.locate.reporter.a.a(g.a()).e());
    }

    public synchronized JSONArray a(@NonNull String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa38b4cc9bcde0540954d9680e5bad6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa38b4cc9bcde0540954d9680e5bad6c");
        }
        JSONArray jSONArray = new JSONArray();
        if (Build.VERSION.SDK_INT < 21) {
            return jSONArray;
        }
        long currentTimeMillis = System.currentTimeMillis();
        List<com.meituan.android.common.locate.provider.c> d = c.a().d();
        int i2 = 0;
        for (int i3 = 0; i3 < d.size(); i3++) {
            try {
                if (currentTimeMillis - d.get(i3).a < com.meituan.android.common.locate.reporter.a.a(g.a()).d()) {
                    if (i2 >= i) {
                        break;
                    }
                    jSONArray.put(d.get(i3).a());
                    i2++;
                }
            } catch (Exception e) {
                LogUtils.a("addBeaconInfoForLocate exception: " + e.getMessage());
            }
        }
        com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("ble_scan_module", "type_scan_ble_cnt", str + CommonConstant.Symbol.UNDERLINE + jSONArray.length(), ""));
        return jSONArray;
    }

    public synchronized int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c8eda4d9681482f1f27e3c3a16c3b4b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c8eda4d9681482f1f27e3c3a16c3b4b")).intValue();
        } else if (Build.VERSION.SDK_INT >= 21) {
            return c.a().e();
        } else {
            return 0;
        }
    }

    public synchronized JSONArray b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74b5cfbdd788f6e976380811d6d0b33e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74b5cfbdd788f6e976380811d6d0b33e");
        }
        return a(str, com.meituan.android.common.locate.reporter.g.a(g.a()).a());
    }
}
