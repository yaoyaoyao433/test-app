package com.meituan.ai.speech.base.utils;

import android.support.annotation.Keep;
import android.util.Log;
import com.meituan.ai.speech.base.log.SPLog;
import com.meituan.ai.speech.base.log.SPLogLevel;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.w;
import kotlin.o;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J8\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004J.\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/meituan/ai/speech/base/utils/BasicAuthUtils;", "", "()V", "AUTH_METHOD", "", "FORMAT_TIME", "HMAC_SHA1", "getBasicAuthDate", "getBasicAuthHeader", "", "appKey", "secretKey", "method", Constants.TRAFFIC_URI, "getBasicAuthorization", "date", "hmacSHA1", "key", "data", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class BasicAuthUtils {
    private static final String AUTH_METHOD = "AIAUTH-V1";
    private static final String FORMAT_TIME = "EEE, dd MMM yyyy HH:mm:ss 'GMT'";
    private static final String HMAC_SHA1 = "HmacSHA1";
    public static final BasicAuthUtils INSTANCE = new BasicAuthUtils();
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public final String getBasicAuthDate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4c517a4204159be21e5f78c072df828", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4c517a4204159be21e5f78c072df828");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMAT_TIME, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(new Date());
        h.a((Object) format, "df.format(Date())");
        return format;
    }

    @NotNull
    public final String getBasicAuthorization(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42f5cdda616e8506886ca509b62171b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42f5cdda616e8506886ca509b62171b2");
        }
        h.b(str, "appKey");
        h.b(str2, "secretKey");
        h.b(str3, "method");
        h.b(str4, Constants.TRAFFIC_URI);
        h.b(str5, "date");
        w wVar = w.a;
        String format = String.format("%s %s\n%s", Arrays.copyOf(new Object[]{str3, str4, str5}, 3));
        h.a((Object) format, "java.lang.String.format(format, *args)");
        String hmacSHA1 = hmacSHA1(str2, format);
        w wVar2 = w.a;
        String format2 = String.format("%s %s:%s", Arrays.copyOf(new Object[]{AUTH_METHOD, str, hmacSHA1}, 3));
        h.a((Object) format2, "java.lang.String.format(format, *args)");
        return format2;
    }

    @NotNull
    public final Map<String, String> getBasicAuthHeader(@Nullable String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05ce47e333409405b70bd88329c76896", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05ce47e333409405b70bd88329c76896");
        }
        h.b(str2, "secretKey");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMAT_TIME, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(new Date());
        w wVar = w.a;
        String format2 = String.format("%s %s\n%s", Arrays.copyOf(new Object[]{str3, str4, format}, 3));
        h.a((Object) format2, "java.lang.String.format(format, *args)");
        String hmacSHA1 = hmacSHA1(str2, format2);
        HashMap hashMap = new HashMap();
        h.a((Object) format, "date");
        hashMap.put("date", format);
        w wVar2 = w.a;
        String format3 = String.format("%s %s:%s", Arrays.copyOf(new Object[]{AUTH_METHOD, str, hmacSHA1}, 3));
        h.a((Object) format3, "java.lang.String.format(format, *args)");
        hashMap.put("auth", format3);
        return hashMap;
    }

    private final String hmacSHA1(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d5855bd38c2904677598fe62a8bf8fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d5855bd38c2904677598fe62a8bf8fa");
        }
        try {
            Charset charset = d.a;
            if (str == null) {
                throw new o("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str.getBytes(charset);
            h.a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, HMAC_SHA1);
            Mac mac = Mac.getInstance(HMAC_SHA1);
            mac.init(secretKeySpec);
            Charset charset2 = StandardCharsets.UTF_8;
            h.a((Object) charset2, "StandardCharsets.UTF_8");
            if (str2 != null) {
                byte[] bytes2 = str2.getBytes(charset2);
                h.a((Object) bytes2, "(this as java.lang.String).getBytes(charset)");
                byte[] doFinal = mac.doFinal(bytes2);
                h.a((Object) doFinal, "mac.doFinal(data.toByteA…(StandardCharsets.UTF_8))");
                return Base64Kt.encodeBase64ToString(doFinal);
            }
            throw new o("null cannot be cast to non-null type java.lang.String");
        } catch (Exception e) {
            String str3 = "hmacSHA1 fail msg=" + e.getMessage();
            String simpleName = getClass().getSimpleName();
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                Log.e("[" + simpleName + ']', str3);
            }
            return "";
        }
    }
}
