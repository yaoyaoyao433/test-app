package com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors;

import android.text.TextUtils;
import android.util.Base64;
import com.dianping.nvnetwork.g;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.MTGlibInterface;
import com.meituan.android.common.mtguard.MTGConfigs;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.mtguard.a;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.Handshake;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okio.c;
/* loaded from: classes2.dex */
public class Ok3NetworkInterceptor implements Interceptor {
    private static final int INDEX = 303;
    public static final String RAPTOR_MITM_KEY = "v5_mitm";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Set<String> TRUST_PINS = new HashSet();
    public static String MITM_INFO = "";

    static {
        TRUST_PINS.add("RpiZH+XxEsJDDVmHh4nbb/cObbh4qrb70P42QrxwkP8=");
        TRUST_PINS.add("8Rw90Ej3Ttt8RRkrg+WYDS9n7IS03bk5bjP/UXPtaY8=");
        TRUST_PINS.add("Ko8tivDrEjiY90yGasP6ZpBU4jwXvHqVvQI0GS3GNdA=");
        TRUST_PINS.add("VjLZe/p3W/PJnd6lL8JVNBCGQBZynFLdZSTIqcO0SJ8=");
        TRUST_PINS.add("vQddefM9bxCZJ6OFE19k95DcFKBVyNLMLv8MLrcbGY8=");
        TRUST_PINS.add("7NKNWIXb5uVzd35m69hfOHmxswS8C1IYIiiOBnAqSZ8=");
        TRUST_PINS.add("jQJTbIh0grw0/1TkHSumWb+Fs0Ggogr621gT3PvPKG0=");
        TRUST_PINS.add("C5+lpZ7tcVwmwQIMcRtPbsQtWLABXhQzejna0wHFr8M=");
        TRUST_PINS.add("jT4i9uxTr9yCb8MbQqthyRUPTyDmWWDCuYw6HK8nd44=");
        TRUST_PINS.add("4adp0AfhxCw/hsmK3d6v5Wc13sHDLcw4530iL6QaGag=");
    }

    private void logRequestInfo(Request request) {
        String str;
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e2bd52b7ce6601063b367f56ec54bbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e2bd52b7ce6601063b367f56ec54bbb");
            return;
        }
        try {
            String encodedPath = request.url().encodedPath();
            if (TextUtils.isEmpty(encodedPath)) {
                return;
            }
            if (encodedPath.equals(DFPConfigs.getXidPath())) {
                str = "1";
            } else if (encodedPath.equals(DFPConfigs.getDFPIDPath())) {
                str = "2";
            } else if (encodedPath.equals(DFPConfigs.getDeviceInfoPath())) {
                str = "3";
            } else if (encodedPath.equals(DFPConfigs.getApplistConfigPath())) {
                str = "4";
            } else if (encodedPath.equals(DFPConfigs.getMiniFamaPath())) {
                str = "5";
            } else if (!encodedPath.equals(DFPConfigs.getBioPath())) {
                return;
            } else {
                str = "6";
            }
            String header = request.header(MTGConfigs.c);
            byte[] bArr = null;
            if (request.body() != null && request.body().contentLength() > 0) {
                c cVar = new c();
                request.body().writeTo(cVar);
                bArr = cVar.r();
            }
            String str2 = new String(bArr);
            MTGuardLog.setLogan("RAPTOR QA SHARK, type:" + str + ", mtgsig:" + header + ", body:" + str2);
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    private boolean needCheck(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cb3e1a00e4893b99fceecd129495735", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cb3e1a00e4893b99fceecd129495735")).booleanValue();
        }
        if (DFPConfigs.getHost().equals(str)) {
            if (DFPConfigs.getDFPIDPath().equals(str2) || DFPConfigs.getXidPath().equals(str2) || DFPConfigs.getDeviceInfoPath().equals(str2)) {
                return true;
            }
        } else if (DFPConfigs.getMiniFamaHost().equals(str) && DFPConfigs.getMiniFamaPath().equals(str2)) {
            return true;
        }
        return false;
    }

    public boolean checkMITM(List<Certificate> list) {
        Certificate next;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75f7368bdd42483e217781c9a94cdc27", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75f7368bdd42483e217781c9a94cdc27")).booleanValue();
        }
        try {
            Iterator<Certificate> it = list.iterator();
            String str = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                str = str + ((X509Certificate) next).getSubjectX500Principal().toString() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
                if (TRUST_PINS.contains(Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(it.next().getPublicKey().getEncoded()), 2))) {
                    str = "";
                    break;
                }
            }
            MTGuardLog.setLogan("subject is " + str + ", mitm info is " + MITM_INFO);
            if (!MITM_INFO.equals(str) || !str.isEmpty()) {
                MITM_INFO = str;
                MTGuardLog.setLogan("mitm changed");
                NBridge.main3(50, new Object[]{303});
            }
            return !str.isEmpty();
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return false;
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Handshake handshake;
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9126176023b6b43045d9d0dae976d61f", 6917529027641081856L)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9126176023b6b43045d9d0dae976d61f");
        }
        if (needCheck(chain.request().url().host(), chain.request().url().encodedPath()) && (handshake = chain.connection().handshake()) != null && checkMITM(handshake.peerCertificates())) {
            String httpUrl = chain.request().url().toString();
            long contentLength = chain.request().body().contentLength();
            MTGuardLog.setLogan("catch MITM, request:" + httpUrl + ", body length:" + contentLength + ", shark init:" + g.u());
            MTGlibInterface.raptorAPI(RAPTOR_MITM_KEY, 3000, (int) contentLength, 0, 0L);
            if (!a.h.booleanValue() && g.u()) {
                chain.call().cancel();
                MTGuardLog.setLogan("cancel request:".concat(String.valueOf(httpUrl)));
                throw new IOException("Canceled");
            }
        }
        logRequestInfo(chain.request());
        return chain.proceed(chain.request());
    }
}
