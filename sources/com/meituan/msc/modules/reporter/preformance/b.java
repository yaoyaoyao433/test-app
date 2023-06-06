package com.meituan.msc.modules.reporter.preformance;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends JSONObject {
    public static ChangeQuickRedirect a;
    public long b;

    public final b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d41e5d222b1c414ff81eb74cc40afec", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d41e5d222b1c414ff81eb74cc40afec");
        }
        try {
            put("entryType", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public final b b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c54da2754654278c8da6e7da0a2f747", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c54da2754654278c8da6e7da0a2f747");
        }
        try {
            put("name", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public final b c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd8b8b3830c942e9c48f03a3370a017c", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd8b8b3830c942e9c48f03a3370a017c");
        }
        try {
            put("navigationType", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public final b d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49a77d1ed593f24c3ff8b0f3c1152759", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49a77d1ed593f24c3ff8b0f3c1152759");
        }
        try {
            put("path", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public final b a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a2a1f0b60de803dd705da1998b5f132", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a2a1f0b60de803dd705da1998b5f132");
        }
        this.b = j;
        try {
            put("startTime", j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public final b b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96e060dab35e6c24b5f02d533945cbac", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96e060dab35e6c24b5f02d533945cbac");
        }
        try {
            put("endTime", j);
            put("duration", j - this.b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public final b c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e7335ab162691d3a85cf72a95d884e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e7335ab162691d3a85cf72a95d884e6");
        }
        try {
            put("navigationStart", j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }
}
