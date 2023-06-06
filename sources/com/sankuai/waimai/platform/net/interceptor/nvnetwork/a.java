package com.sankuai.waimai.platform.net.interceptor.nvnetwork;

import android.net.Uri;
import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.r;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import com.sankuai.waimai.foundation.utils.af;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements r {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0260  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // com.dianping.nvnetwork.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rx.d<com.dianping.nvnetwork.q> intercept(com.dianping.nvnetwork.r.a r23) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.net.interceptor.nvnetwork.a.intercept(com.dianping.nvnetwork.r$a):rx.d");
    }

    private HashMap<String, String> a(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fb19d0838342ae6c9c9ed35f4b16be2", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fb19d0838342ae6c9c9ed35f4b16be2");
        }
        List<String> a2 = com.sankuai.waimai.platform.net.e.a();
        HashMap<String, String> hashMap = null;
        if (com.sankuai.waimai.foundation.utils.d.a(a2) || request.g == null) {
            return null;
        }
        for (String str : a2) {
            String str2 = request.g.get(str);
            if (!TextUtils.isEmpty(str2)) {
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                }
                hashMap.put(str, str2);
                request.g.remove(str);
            }
        }
        return hashMap;
    }

    private boolean a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fef6688dc6c8ca15896295cf60d1383b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fef6688dc6c8ca15896295cf60d1383b")).booleanValue();
        }
        if (inputStream != null) {
            try {
                if (inputStream.available() != 0) {
                    return false;
                }
            } catch (IOException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                return true;
            }
        }
        return true;
    }

    private void a(Uri.Builder builder, List<Map<String, String>> list) {
        Object[] objArr = {builder, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a53abb26cea2226080e260595b6695d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a53abb26cea2226080e260595b6695d");
            return;
        }
        for (Map<String, String> map : list) {
            if (map != null && !map.isEmpty()) {
                af.a(builder, map);
            }
        }
    }

    private InputStream a(Request request, List<Map<String, String>> list) {
        HashMap<String, String> hashMap;
        boolean z = true;
        Object[] objArr = {request, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92301884d07d6bafef9194046233cdf0", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92301884d07d6bafef9194046233cdf0");
        }
        InputStream inputStream = request.i;
        boolean a2 = a(inputStream);
        if ((inputStream instanceof com.dianping.nvnetwork.util.f) || a2) {
            if (a2) {
                hashMap = new HashMap<>();
            } else {
                hashMap = ((com.dianping.nvnetwork.util.f) inputStream).b;
            }
            for (Map<String, String> map : list) {
                if (map != null && !map.isEmpty()) {
                    hashMap.putAll(map);
                }
            }
            if (a2) {
                request.g.put("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM);
                return new com.dianping.nvnetwork.util.f(hashMap);
            }
            return inputStream;
        } else if (PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM.equals(request.g.get("Content-Type"))) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                IOUtils.copy(inputStream, byteArrayOutputStream);
                int size = byteArrayOutputStream.size();
                for (Map<String, String> map2 : list) {
                    if (map2 != null && !map2.isEmpty()) {
                        for (String str : map2.keySet()) {
                            if (str != null) {
                                String str2 = map2.get(str);
                                if (str2 == null) {
                                    str2 = "";
                                }
                                String encode = URLEncoder.encode(str, "UTF-8");
                                String encode2 = URLEncoder.encode(str2, "UTF-8");
                                StringBuilder sb = new StringBuilder(encode.length() + encode2.length() + 2);
                                if (size > 0 || !z) {
                                    sb.append('&');
                                }
                                sb.append(encode);
                                sb.append('=');
                                sb.append(encode2);
                                byteArrayOutputStream.write(sb.toString().getBytes(StandardCharsets.UTF_8));
                                z = false;
                            }
                        }
                    }
                }
                return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                return null;
            }
        } else {
            return null;
        }
    }
}
