package com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.meituan.retrofit2.raw.b;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class MtRetrofitInterceptor implements Interceptor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mContext;

    public MtRetrofitInterceptor() {
    }

    public MtRetrofitInterceptor(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3053a9482c14a1e478967e604505dba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3053a9482c14a1e478967e604505dba");
        } else {
            this.mContext = context;
        }
    }

    private ByteArrayOutputStream cloneInputStream(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bc65ac19b7561d05e692634fc175af5", 6917529027641081856L)) {
            return (ByteArrayOutputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bc65ac19b7561d05e692634fc175af5");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return null;
        }
    }

    private b getOriginalResponse(final b bVar, final InputStream inputStream) {
        Object[] objArr = {bVar, inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39b702363ed7a1480197b512ad55b70d", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39b702363ed7a1480197b512ad55b70d") : new b() { // from class: com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.MtRetrofitInterceptor.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.meituan.retrofit2.raw.b
            public ap body() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c8030add89885cd42c95ba8f2b6b81c2", 6917529027641081856L) ? (ap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c8030add89885cd42c95ba8f2b6b81c2") : bVar.body().newBuilder().a(inputStream).a();
            }

            @Override // com.sankuai.meituan.retrofit2.raw.b
            public int code() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "852b2307d25211d5bb1fd0c8b29be3ad", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "852b2307d25211d5bb1fd0c8b29be3ad")).intValue() : bVar.code();
            }

            @Override // com.sankuai.meituan.retrofit2.raw.b
            @Nullable
            public List<q> headers() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7cf9ea913342df4e34a39c0dbc768857", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7cf9ea913342df4e34a39c0dbc768857") : bVar.headers();
            }

            @Override // com.sankuai.meituan.retrofit2.raw.b
            public String reason() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5d718c632a9a872637466ed829c26094", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5d718c632a9a872637466ed829c26094") : bVar.reason();
            }

            @Override // com.sankuai.meituan.retrofit2.raw.b
            public String url() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "17e3eed444195b11b72edfd74de6c560", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "17e3eed444195b11b72edfd74de6c560") : bVar.url();
            }
        };
    }

    private void initOriginalHeaders(Map<String, String> map, aj ajVar) {
        Object[] objArr = {map, ajVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc6123aa7067bbe5073faf79ebacb609", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc6123aa7067bbe5073faf79ebacb609");
            return;
        }
        int size = ajVar.d().size();
        for (int i = 0; i < size; i++) {
            map.put(ajVar.d().get(i).a(), ajVar.d().get(i).b());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    @Override // com.sankuai.meituan.retrofit2.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.sankuai.meituan.retrofit2.raw.b intercept(com.sankuai.meituan.retrofit2.Interceptor.a r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.MtRetrofitInterceptor.intercept(com.sankuai.meituan.retrofit2.Interceptor$a):com.sankuai.meituan.retrofit2.raw.b");
    }
}
