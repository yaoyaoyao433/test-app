package com.meituan.ai.speech.base.utils;

import android.support.annotation.Keep;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import kotlin.ranges.c;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0004H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0004H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0001H\u0007¨\u0006\u0007"}, d2 = {"encodeUrlHeader", "", "originalHeader", "encodeBase64", "", "encodeBase64ToByteArray", "encodeBase64ToString", "speech-base_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class Base64Kt {
    public static ChangeQuickRedirect a;

    @Keep
    @NotNull
    public static final String encodeBase64ToString(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da3f1f118336630e13b721f19ff0c912", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da3f1f118336630e13b721f19ff0c912");
        }
        h.b(str, "receiver$0");
        byte[] bytes = str.getBytes(d.a);
        h.a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        return new String(encodeBase64(bytes), d.a);
    }

    @Keep
    @NotNull
    public static final byte[] encodeBase64ToByteArray(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3a4985f72fa54654c5a974e0b168c99", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3a4985f72fa54654c5a974e0b168c99");
        }
        h.b(str, "receiver$0");
        byte[] bytes = str.getBytes(d.a);
        h.a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        return encodeBase64(bytes);
    }

    @Keep
    @NotNull
    public static final String encodeBase64ToString(@NotNull byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e18f75b535aca1bcdf024d7f70d695d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e18f75b535aca1bcdf024d7f70d695d");
        }
        h.b(bArr, "receiver$0");
        return new String(encodeBase64(bArr), d.a);
    }

    @Keep
    @NotNull
    public static final byte[] encodeBase64(@NotNull byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "157240a16c57bdc60ebfe5f1902ce176", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "157240a16c57bdc60ebfe5f1902ce176");
        }
        h.b(bArr, "receiver$0");
        c cVar = new c('A', 'Z');
        c cVar2 = new c('a', 'z');
        h.b(cVar, "$this$plus");
        h.b(cVar2, DynamicTitleParser.PARSER_KEY_ELEMENTS);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        kotlin.collections.h.a((Collection) arrayList2, (Iterable) cVar);
        kotlin.collections.h.a((Collection) arrayList2, (Iterable) cVar2);
        char[] b = kotlin.collections.h.b((Collection<Character>) kotlin.collections.h.a((Collection<? extends char>) kotlin.collections.h.a((Collection<? extends char>) kotlin.collections.h.b(arrayList, new c('0', '9')), '+'), '/'));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2 += 3) {
            int i3 = ((bArr[i2] & 255) << 16) & ViewCompat.MEASURED_SIZE_MASK;
            int i4 = i2 + 1;
            if (i4 < bArr.length) {
                i3 |= (bArr[i4] & 255) << 8;
            } else {
                i++;
            }
            int i5 = i2 + 2;
            if (i5 < bArr.length) {
                i3 |= bArr[i5] & 255;
            } else {
                i++;
            }
            int i6 = 4 - i;
            int i7 = i3;
            for (int i8 = 0; i8 < i6; i8++) {
                byteArrayOutputStream.write(b[(16515072 & i7) >> 18]);
                i7 <<= 6;
            }
        }
        for (int i9 = 0; i9 < i; i9++) {
            byteArrayOutputStream.write(61);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        h.a((Object) byteArray, "output.toByteArray()");
        return byteArray;
    }

    @Keep
    @NotNull
    public static final String encodeUrlHeader(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ad77c2f2e0f459f80128c7471aa8c36", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ad77c2f2e0f459f80128c7471aa8c36");
        }
        h.b(str, "originalHeader");
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String encode = URLEncoder.encode(str, "UTF-8");
        int length = encode.length() <= 128 ? encode.length() : 128;
        h.a((Object) encode, "encodeHeader");
        int i = length - 1;
        if (encode != null) {
            String substring = encode.substring(0, i);
            h.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new o("null cannot be cast to non-null type java.lang.String");
    }
}
