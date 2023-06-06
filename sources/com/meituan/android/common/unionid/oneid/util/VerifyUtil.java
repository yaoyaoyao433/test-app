package com.meituan.android.common.unionid.oneid.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class VerifyUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean verifyImei(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1aa1f058f3d01e6c0387bfa753a45de3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1aa1f058f3d01e6c0387bfa753a45de3")).booleanValue() : Pattern.matches("[0-9]{15}", str);
    }

    public static boolean verifyAndroidId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "92321b3e2abf02da8717453c7c46b0c8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "92321b3e2abf02da8717453c7c46b0c8")).booleanValue() : !TextUtils.isEmpty(str) && Pattern.matches("[0-9a-f]{10,16}", str);
    }

    public static boolean verifyMeid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c11f08f51d534c0da1c0612989c800ce", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c11f08f51d534c0da1c0612989c800ce")).booleanValue() : Pattern.matches("[0-9A-F]{14}", str.toUpperCase());
    }

    public static boolean verifySerialNumber(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e0ede3b82d5dc4af9835adcaca620d97", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e0ede3b82d5dc4af9835adcaca620d97")).booleanValue() : Pattern.matches("[0-9A-Z]{16}", str);
    }

    public static boolean verifySimulatedId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d9071ac249b5978fdcc60cba9a23ee69", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d9071ac249b5978fdcc60cba9a23ee69")).booleanValue() : verifyImei(str);
    }

    public static boolean verifyImsi(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d684ebe752bdf0aa2cf288d26123d0d2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d684ebe752bdf0aa2cf288d26123d0d2")).booleanValue() : verifyImei(str);
    }

    public static boolean verifyIccid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b1593d300f44ce2c421d6cfce625cec4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b1593d300f44ce2c421d6cfce625cec4")).booleanValue() : Pattern.matches("^\\d{20}", str);
    }

    public static boolean verifyDpid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb6a8ad3e2b7357ffc89223634d1078b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb6a8ad3e2b7357ffc89223634d1078b")).booleanValue() : Pattern.matches("^[0-9]{18,22}$", str);
    }

    public static boolean verifyUnionId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a14c9cff7bedb982b61add9bc7b320f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a14c9cff7bedb982b61add9bc7b320f")).booleanValue() : Pattern.matches("^[0-9a-f]{51}$", str);
    }
}
