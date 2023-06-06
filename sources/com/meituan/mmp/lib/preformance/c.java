package com.meituan.mmp.lib.preformance;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends JSONObject {
    public static ChangeQuickRedirect a;
    public long b;

    public final c a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76e4f816a06c368df252102f7e6b583e", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76e4f816a06c368df252102f7e6b583e");
        }
        try {
            put("entryType", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public final c b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8406ffcf17a8f940c6ea676e5f9af4cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8406ffcf17a8f940c6ea676e5f9af4cd");
        }
        try {
            put("name", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public final c c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3adac005b49cde367987d8d69258ddc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3adac005b49cde367987d8d69258ddc2");
        }
        try {
            put("navigationType", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public final c d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90377fc5f4535bd3dcd45a924d92cd58", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90377fc5f4535bd3dcd45a924d92cd58");
        }
        try {
            put("path", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public final c a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40c680c1426d390196edda9f8a3195e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40c680c1426d390196edda9f8a3195e7");
        }
        this.b = j;
        try {
            put("startTime", j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public final c b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "294e3e8ba3a7d6ca911052202cafd0fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "294e3e8ba3a7d6ca911052202cafd0fa");
        }
        try {
            put("endTime", j);
            put("duration", j - this.b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public final c c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b76e9f1d90383f41ff8980211c47ca16", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b76e9f1d90383f41ff8980211c47ca16");
        }
        try {
            put("navigationStart", j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }
}
