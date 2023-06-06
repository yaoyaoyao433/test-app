package com.meituan.passport.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ai {
    public static ChangeQuickRedirect a;
    private static ai b;

    public static ai a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82a7e684f7ee8bb5ba67eeb4064ecbc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ai) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82a7e684f7ee8bb5ba67eeb4064ecbc0");
        }
        if (b == null) {
            b = new ai();
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
        if (r20.equals("china_mobile") != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.support.v4.app.FragmentActivity r19, java.lang.String r20, java.lang.String r21, int r22) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.passport.utils.ai.a(android.support.v4.app.FragmentActivity, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
        if (r20.equals("china_mobile") != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.support.v4.app.FragmentActivity r19, java.lang.String r20, java.lang.String r21, int r22) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.passport.utils.ai.b(android.support.v4.app.FragmentActivity, java.lang.String, java.lang.String, int):void");
    }

    public final void a(FragmentActivity fragmentActivity, int i) {
        Object[] objArr = {fragmentActivity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a419323549b78d6de0bff4c1f4e1baf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a419323549b78d6de0bff4c1f4e1baf5");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", "1");
        hashMap.put("status", "短信验证码");
        hashMap.put("type", i == 3 ? "注册" : "登录");
        hashMap.put("pagekey", "c_hvcwz3nv");
        aj.b(fragmentActivity, "b_group_p25cisyq_mv", "c_hvcwz3nv", hashMap);
    }

    public final void a(FragmentActivity fragmentActivity, int i, int i2) {
        Object[] objArr = {fragmentActivity, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c77e521c4a49f5761c86d258d1811b9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c77e521c4a49f5761c86d258d1811b9f");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i2));
        hashMap.put("status", "短信验证码");
        hashMap.put("type", i == 3 ? "注册" : "登录");
        hashMap.put("pagekey", "c_hvcwz3nv");
        aj.b(fragmentActivity, "b_group_p25cisyq_mv", "c_hvcwz3nv", hashMap);
    }

    public final void b(FragmentActivity fragmentActivity, int i) {
        Object[] objArr = {fragmentActivity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deba443649491fd578aaa5ef008826e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deba443649491fd578aaa5ef008826e3");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i));
        hashMap.put("status", "账号密码");
        hashMap.put("type", "登录");
        hashMap.put("pagekey", "c_01clrpum");
        aj.b(fragmentActivity, "b_group_p25cisyq_mv", "c_01clrpum", hashMap);
    }

    public final void a(Fragment fragment, int i, int i2) {
        Object[] objArr = {fragment, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "434653e95a20b16939ea742d1b5ab59c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "434653e95a20b16939ea742d1b5ab59c");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i2));
        hashMap.put("status", "快捷登录");
        hashMap.put("type", i == 3 ? "注册" : "登录");
        if (fragment != null && fragment.getActivity() != null && fragment.getActivity().getClass() != null) {
            hashMap.put("pagekey", fragment.getActivity().getClass().getName());
        }
        aj.b(fragment, "b_group_p25cisyq_mv", "c_0ov25mx3", hashMap);
    }

    public final void b(FragmentActivity fragmentActivity, int i, int i2) {
        Object[] objArr = {fragmentActivity, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "899eacdf4a91ad511573b48864a6c902", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "899eacdf4a91ad511573b48864a6c902");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i2));
        hashMap.put("status", "快捷登录");
        hashMap.put("type", i == 3 ? "注册" : "登录");
        if (fragmentActivity != null) {
            hashMap.put("pagekey", fragmentActivity.getClass().getName());
        }
        aj.b(fragmentActivity, "b_group_p25cisyq_mv", "c_0ov25mx3", hashMap);
    }
}
