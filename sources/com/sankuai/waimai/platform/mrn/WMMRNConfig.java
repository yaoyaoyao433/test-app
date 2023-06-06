package com.sankuai.waimai.platform.mrn;

import android.net.Uri;
import android.os.SystemClock;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.e;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.capacity.log.c;
import io.agora.rtc.internal.RtcEngineEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class WMMRNConfig {
    public static ChangeQuickRedirect a;
    private static Map<String, Config> b;
    private static e<SpConfig> c = new e<>("waimai_mrn_gray_release_config_v2");

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @SerializedName(NetLogConstants.Details.REDIRECT)
        public WMMRNRouterConfig a;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    enum SpConfig {
        CONFIG;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static SpConfig valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "19ed9c8d8bee5e5bf3b1d187e1cc3248", RobustBitConfig.DEFAULT_VALUE) ? (SpConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "19ed9c8d8bee5e5bf3b1d187e1cc3248") : (SpConfig) Enum.valueOf(SpConfig.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SpConfig[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0403447a87f4bcc4e8c7d23e3c3cffb8", RobustBitConfig.DEFAULT_VALUE) ? (SpConfig[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0403447a87f4bcc4e8c7d23e3c3cffb8") : (SpConfig[]) values().clone();
        }

        SpConfig() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b96f168d2eeb8f3020930a9e6e136a2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b96f168d2eeb8f3020930a9e6e136a2");
            }
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8881dc6ade9702eff900bf55822c167e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8881dc6ade9702eff900bf55822c167e");
            return;
        }
        e<SpConfig> eVar = c;
        SpConfig spConfig = SpConfig.CONFIG;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        eVar.a((e<SpConfig>) spConfig, str);
    }

    public static Map<String, Config> a() {
        WMMRNRouterConfig parse;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5bb5abf2ff52a79999e93d440774bc1f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5bb5abf2ff52a79999e93d440774bc1f");
        }
        if (b == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "21245dc26f871cf30a093780eb10add1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "21245dc26f871cf30a093780eb10add1");
            } else {
                try {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8b3b63ee37a100aff66611ced518d191", RobustBitConfig.DEFAULT_VALUE)) {
                        parse = (WMMRNRouterConfig) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8b3b63ee37a100aff66611ced518d191");
                    } else {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        parse = WMMRNRouterConfig.parse(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "723d20d4c1fdf2b067134a8e1b5d7395", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "723d20d4c1fdf2b067134a8e1b5d7395") : c.b((e<SpConfig>) SpConfig.CONFIG, ""));
                    }
                    if (parse != null && parse.wNative != null && parse.wNative.size() > 0) {
                        b = new HashMap(parse.wNative.size());
                        StringBuilder sb = new StringBuilder();
                        for (Config config : parse.wNative) {
                            if (config != null && !TextUtils.isEmpty(config.getDstUrl()) && !TextUtils.isEmpty(config.getSrcUrl())) {
                                Uri parse2 = Uri.parse(config.getSrcUrl());
                                sb.delete(0, sb.length());
                                sb.append(b(parse2));
                                b.put(sb.toString(), config);
                            }
                        }
                    }
                    if (parse != null && parse.h5 != null && parse.h5.size() > 0) {
                        if (b == null) {
                            b = new HashMap(parse.h5.size());
                        }
                        StringBuilder sb2 = new StringBuilder();
                        for (Config config2 : parse.h5) {
                            if (config2 != null && !TextUtils.isEmpty(config2.getDstUrl()) && !TextUtils.isEmpty(config2.getSrcUrl())) {
                                Uri parse3 = Uri.parse(config2.getSrcUrl());
                                sb2.delete(0, sb2.length());
                                sb2.append(b(parse3));
                                b.put(sb2.toString(), config2);
                            }
                        }
                    }
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
            }
        }
        return b;
    }

    public static String a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "289039def7f766c700eb3c88e59d6aa2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "289039def7f766c700eb3c88e59d6aa2");
        }
        if (uri != null) {
            return uri.getScheme() + "://" + uri.getHost() + uri.getPath();
        }
        return null;
    }

    private static String b(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3fbeea3342525325bf309d385b0b0d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3fbeea3342525325bf309d385b0b0d5");
        }
        if (uri != null) {
            String str = uri.getScheme() + "://" + uri.getHost() + uri.getPath();
            if (uri.getQuery() != null) {
                return str + CommonConstant.Symbol.QUESTION_MARK + uri.getQuery();
            }
            return str;
        }
        return null;
    }

    public static String a(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc9232b1e34b72f1b99e2f501ae32c14", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc9232b1e34b72f1b99e2f501ae32c14");
        }
        if (uri != null) {
            return uri.getScheme() + "://" + uri.getHost() + uri.getPath() + CommonConstant.Symbol.QUESTION_MARK + str + "=" + uri.getQueryParameter(str);
        }
        return null;
    }

    public static void a(Config config) {
        Object[] objArr = {config};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae7a349808882bd9c0e04a1967233387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae7a349808882bd9c0e04a1967233387");
        } else if (config != null) {
            if (config.issSwitch()) {
                c.a().a(RtcEngineEvent.EvtType.EVT_AUDIO_VOLUME_INDICATION, config.getCatCmd(), SystemClock.elapsedRealtime());
            } else {
                c.a().a(RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_VIDEO_FRAME, config.getCatCmd(), SystemClock.elapsedRealtime());
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class WMMRNRouterConfig {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("h5")
        public List<Config> h5;
        @SerializedName("native")
        public List<Config> wNative;

        public List<Config> getwNative() {
            return this.wNative;
        }

        public void setwNative(List<Config> list) {
            this.wNative = list;
        }

        public List<Config> getH5() {
            return this.h5;
        }

        public void setH5(List<Config> list) {
            this.h5 = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static WMMRNRouterConfig parse(String str) throws Exception {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f8e1caef86de2d1d49a6f1e0acf975df", RobustBitConfig.DEFAULT_VALUE)) {
                return (WMMRNRouterConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f8e1caef86de2d1d49a6f1e0acf975df");
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return ((a) k.a().fromJson(str, (Class<Object>) a.class)).a;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("catCmd")
        private String catCmd;
        @SerializedName("dstUrl")
        private String dstUrl;
        @SerializedName("switch")
        private boolean sSwitch;
        @SerializedName("srcUrl")
        private String srcUrl;

        public String getSrcUrl() {
            return this.srcUrl;
        }

        public void setSrcUrl(String str) {
            this.srcUrl = str;
        }

        public String getDstUrl() {
            return this.dstUrl;
        }

        public void setDstUrl(String str) {
            this.dstUrl = str;
        }

        public boolean issSwitch() {
            return this.sSwitch;
        }

        public void setsSwitch(boolean z) {
            this.sSwitch = z;
        }

        public String getCatCmd() {
            return this.catCmd;
        }

        public void setCatCmd(String str) {
            this.catCmd = str;
        }
    }
}
