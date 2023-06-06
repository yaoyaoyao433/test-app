package com.sankuai.mads.internal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007J4\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\nH\u0007¨\u0006\u000e"}, d2 = {"Lcom/sankuai/mads/internal/AdConverter;", "", "()V", "convertLogs", "", "dpLogs", "", "generateEventData", "chargeInfo", SocialConstants.PARAM_ACT, "", "eventId", "adLogIdentifier", "networkType", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final a b = new a();

    @JvmStatic
    @NotNull
    public static final String a(@NotNull String str, int i, @Nullable String str2, @Nullable String str3, int i2) {
        String jSONObject;
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dde70d41edb02fd8a6055cf7c54ee854", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dde70d41edb02fd8a6055cf7c54ee854");
        }
        h.b(str, "chargeInfo");
        StringBuilder sb = new StringBuilder();
        if (str.length() > 0) {
            sb.append(str);
        }
        if (sb.length() == 0) {
            sb.append("act=" + i);
        } else {
            sb.append("&act=" + i);
        }
        sb.append("&actTime=" + String.valueOf(System.currentTimeMillis()));
        sb.append("&net_type=" + i2);
        if (str2 != null) {
            if (str2.length() > 0) {
                sb.append("&event_id=" + str2);
            }
        }
        if (str3 != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("adlog_identifier", str3);
            } catch (JSONException unused) {
            }
            try {
                jSONObject = URLEncoder.encode(jSONObject2.toString(), "UTF-8");
            } catch (UnsupportedEncodingException unused2) {
                jSONObject = jSONObject2.toString();
            }
            sb.append("&added=" + jSONObject);
        }
        sb.append("&mads_v=a1.5.14");
        if (h.a((Object) c.l.i(), (Object) "https://mads.meituan.com")) {
            sb.append("&cexp=1");
        }
        String sb2 = sb.toString();
        h.a((Object) sb2, "sb.toString()");
        return sb2;
    }

    @JvmStatic
    @NotNull
    public static final String a(@NotNull List<String> list) throws UnsupportedEncodingException {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f556b2d4b08b8d6369b57f31f978dec", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f556b2d4b08b8d6369b57f31f978dec");
        }
        h.b(list, "dpLogs");
        JSONArray jSONArray = new JSONArray();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(list.get(i));
        }
        String encode = URLEncoder.encode(jSONArray.toString(), "UTF-8");
        h.a((Object) encode, "URLEncoder.encode(logArr.toString(), \"UTF-8\")");
        return encode;
    }
}
