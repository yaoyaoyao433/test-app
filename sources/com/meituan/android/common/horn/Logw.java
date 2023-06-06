package com.meituan.android.common.horn;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Logw {
    public static final String TAG = "HORN_DEBUG";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int v(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "65d26d7ab6b998e27fe86e0a3633e125", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "65d26d7ab6b998e27fe86e0a3633e125")).intValue();
        }
        if (InnerHorn.isDebug) {
            return Log.v(str, str2);
        }
        return -1;
    }

    public static int v(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7ab205a62b9a0417e6c31dcf78099373", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7ab205a62b9a0417e6c31dcf78099373")).intValue();
        }
        if (InnerHorn.isDebug) {
            return Log.v(str, str2, th);
        }
        return -1;
    }

    public static int d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "24d94e0ffa43187f9deba5bd676d7df5", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "24d94e0ffa43187f9deba5bd676d7df5")).intValue();
        }
        if (InnerHorn.isDebug) {
            return Log.d(str, str2);
        }
        return -1;
    }

    public static int d(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7af35bcedd9b3daa9f7e62d18b2211ff", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7af35bcedd9b3daa9f7e62d18b2211ff")).intValue();
        }
        if (InnerHorn.isDebug) {
            return Log.d(str, str2, th);
        }
        return -1;
    }

    public static int i(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "41171df3e51061468a5fe4c7bb75f636", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "41171df3e51061468a5fe4c7bb75f636")).intValue();
        }
        if (InnerHorn.isDebug) {
            return Log.i(str, str2);
        }
        return -1;
    }

    public static int i(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "83c2f0f9e0590a7227d1c906f50fc15a", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "83c2f0f9e0590a7227d1c906f50fc15a")).intValue();
        }
        if (InnerHorn.isDebug) {
            return Log.i(str, str2, th);
        }
        return -1;
    }

    public static int w(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "725a6cab63044f86346d38a60aad3fc5", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "725a6cab63044f86346d38a60aad3fc5")).intValue();
        }
        if (InnerHorn.isDebug) {
            return Log.w(str, str2);
        }
        return -1;
    }

    public static int w(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a6c82551f154a637b5422afe528ba998", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a6c82551f154a637b5422afe528ba998")).intValue();
        }
        if (InnerHorn.isDebug) {
            return Log.w(str, str2, th);
        }
        return -1;
    }

    public static int e(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "92315974e3afd7ccd34aa623f6058c3b", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "92315974e3afd7ccd34aa623f6058c3b")).intValue();
        }
        if (InnerHorn.isDebug) {
            return Log.e(str, str2);
        }
        return -1;
    }

    public static int e(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f1d6aa1bc165ef293289f35cb6d5c002", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f1d6aa1bc165ef293289f35cb6d5c002")).intValue();
        }
        if (InnerHorn.isDebug) {
            return Log.e(str, str2, th);
        }
        return -1;
    }
}
