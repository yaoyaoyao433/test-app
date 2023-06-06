package com.meituan.mtwebkit;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTMimeTypeMap {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final MTMimeTypeMap sMTMimeTypeMap = new MTMimeTypeMap();
    private static final MimeTypeMap sMimeTypeMap = MimeTypeMap.getSingleton();

    public static String getFileExtensionFromUrl(String str) {
        int lastIndexOf;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb04a825ff1b1f31c9661631694d8cff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb04a825ff1b1f31c9661631694d8cff");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf2 = str.lastIndexOf(35);
        if (lastIndexOf2 > 0) {
            str = str.substring(0, lastIndexOf2);
        }
        int lastIndexOf3 = str.lastIndexOf(63);
        if (lastIndexOf3 > 0) {
            str = str.substring(0, lastIndexOf3);
        }
        int lastIndexOf4 = str.lastIndexOf(47);
        if (lastIndexOf4 >= 0) {
            str = str.substring(lastIndexOf4 + 1);
        }
        return (str.isEmpty() || !Pattern.matches("[a-zA-Z_0-9\\.\\-\\(\\)\\%]+", str) || (lastIndexOf = str.lastIndexOf(46)) < 0) ? "" : str.substring(lastIndexOf + 1);
    }

    public boolean hasMimeType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4bddac63b91faac1890a2b9c02e9bbf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4bddac63b91faac1890a2b9c02e9bbf")).booleanValue() : sMimeTypeMap.hasMimeType(str);
    }

    public String getMimeTypeFromExtension(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "139d6b106965ab3e52aac290467a57ff", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "139d6b106965ab3e52aac290467a57ff") : sMimeTypeMap.getMimeTypeFromExtension(str);
    }

    public boolean hasExtension(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0427def71330def76386a16052dd7664", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0427def71330def76386a16052dd7664")).booleanValue() : sMimeTypeMap.hasExtension(str);
    }

    public String getExtensionFromMimeType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2c1f459e40814cab001553d071b116c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2c1f459e40814cab001553d071b116c") : sMimeTypeMap.getExtensionFromMimeType(str);
    }

    public static MTMimeTypeMap getSingleton() {
        return sMTMimeTypeMap;
    }
}
