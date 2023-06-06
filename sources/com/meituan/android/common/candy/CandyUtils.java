package com.meituan.android.common.candy;

import android.content.Context;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.URI;
import java.util.Map;
@Deprecated
/* loaded from: classes2.dex */
public class CandyUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static URI candyProcessorGet(Context context, URI uri, String str, String str2, Map<String, String> map) {
        Object[] objArr = {context, uri, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eab5c2a0d51f813cfdf23f42748b9821", 6917529027641081856L) ? (URI) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eab5c2a0d51f813cfdf23f42748b9821") : a.a(context, uri, str, str2, map, null);
    }

    public static URI candyProcessorOther(Context context, URI uri, byte[] bArr, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2) {
        Object[] objArr = {context, uri, bArr, str, str2, map, str3, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bcb0042c8596cc80cbca8aa332356cda", 6917529027641081856L) ? (URI) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bcb0042c8596cc80cbca8aa332356cda") : a.a(context, uri, bArr, str, str2, map, str3, map2);
    }

    public static URI candyProcessorPost(Context context, URI uri, byte[] bArr, String str, String str2, Map<String, String> map, Map<String, String> map2) {
        Object[] objArr = {context, uri, bArr, str, str2, map, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "98fb2eee77c986e44755279d66d049da", 6917529027641081856L) ? (URI) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "98fb2eee77c986e44755279d66d049da") : a.a(context, uri, bArr, str, str2, map, map2);
    }
}
