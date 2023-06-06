package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Bundle;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.net.NetConfig;
import com.tencent.map.tools.net.NetManager;
import com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp;
import com.tencent.mapsdk.core.components.protocol.jce.conf.SCFileUpdateRsp;
import com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest;
import com.tencent.mapsdk.core.components.protocol.jce.rtt.RttResponse;
import com.tencent.mapsdk.core.components.protocol.jce.sso.CmdResult;
import com.tencent.mapsdk.core.components.protocol.jce.sso.Header;
import com.tencent.mapsdk.core.components.protocol.jce.sso.Package;
import com.tencent.mapsdk.core.components.protocol.jce.sso.Tag;
import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic;
import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail;
import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Response;
import com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t;
import com.tencent.mapsdk.internal.ch;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.TencentMapProtocol;
import com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ck extends bm implements cg, TencentMapProtocol {
    private static final String a = "cuid";
    private static final String b = "duid";
    private static final Stack<cc> f = new Stack<>();
    private static final cc g = new cd();
    private cc c;
    private final Map<String, String> d = new HashMap();
    private TencentMapOptions e;

    public ck() {
    }

    private ck(TencentMapOptions tencentMapOptions, cc ccVar) {
        this.e = tencentMapOptions;
        this.c = ccVar;
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void a(bn bnVar, Bundle bundle) {
        super.a(bnVar, bundle);
        gy.a(e().a());
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void a(bn bnVar) {
        super.a(bnVar);
        if (bnVar == null) {
            return;
        }
        this.e = bnVar.a;
        TencentMapOptions tencentMapOptions = this.e;
        Object protocolDataDesc = tencentMapOptions.getProtocolDataDesc();
        String str = bnVar.u().a;
        if (this.c == null) {
            this.c = g;
        }
        if (protocolDataDesc != null) {
            cc ccVar = null;
            int protocolFrom = tencentMapOptions.getProtocolFrom();
            if (protocolFrom == -1) {
                ccVar = a(bnVar, str, (String) protocolDataDesc);
            } else if (protocolFrom == 1) {
                ccVar = a(str, bnVar.getContext().getResources().openRawResource(((Integer) protocolDataDesc).intValue()));
            } else if (protocolFrom == 3) {
                ccVar = a(str, (String) protocolDataDesc);
            }
            if (ccVar != null) {
                this.c = ccVar;
            }
        }
        if (this.c == null) {
            this.c = g;
        } else {
            this.c.a = str;
            this.c.a(this);
        }
        f.push(this.c);
        Context b2 = b();
        TencentMapOptions tencentMapOptions2 = this.e;
        NetConfig arguments = NetConfig.create().setAdapterType(tencentMapOptions2.getNetAdapterType()).setLogEnable(sd.d).setForceHttps(tencentMapOptions2.isForceHttps()).setArguments(tencentMapOptions2.getNetParams());
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("apikey.map.qq.com/mkey/index.php/mkey/check", "map_nf_auth");
        hashMap.put("vectorsdk.map.qq.com/mvd_map", "map_nf_mvd");
        hashMap.put("vectorsdk.map.qq.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("p0.map.gtimg.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("vectorsdk.map.qq.com/indoormap2", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormap2/index", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormapx", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormapx/index", "map_nf_indoor");
        hashMap.put("tafrtt.map.qq.com/rttserverex/", "map_nf_trfc");
        hashMap.put("p0.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p1.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p2.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p3.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("apikey.map.qq.com/sdkapis/v1/cos_token", "map_nf_fileup");
        hashMap.put("overseactrl.map.qq.com", "map_nf_wdVer");
        hashMap.put("s0.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s1.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s2.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s3.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("confinfo.map.qq.com/confinfo", "map_nf_hdVer");
        hashMap.put("p0.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p1.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p2.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p3.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("sdkgw.map.qq.com/map/traffic/event", "map_nf_pnt");
        hashMap.put("sdkgw.map.qq.com/map/poi/detail", "map_nf_aoi");
        hashMap.put("mapapi.qq.com/sdk/", "map_nf_res");
        hashMap.put("wecar.myapp.com/myapp/mapwecar", "map_nf_res");
        hashMap.put("map.myapp.com/soso_map/", "map_nf_off");
        hashMap.put("pr.map.qq.com/ditusdk/monitor", "map_nf_pr");
        hashMap.put("s0.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s1.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s2.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s3.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("datalayer.map.qq.com/console/datalayer/data", "map_nf_visLyr");
        NetManager.init(b2, arguments.setNetFlowRuleList(hashMap).setProcessor(ge.class).setProxyRuleList(e().b()));
        gy.a(e().a());
    }

    private static void a(Context context, TencentMapOptions tencentMapOptions) {
        NetConfig arguments = NetConfig.create().setAdapterType(tencentMapOptions.getNetAdapterType()).setLogEnable(sd.d).setForceHttps(tencentMapOptions.isForceHttps()).setArguments(tencentMapOptions.getNetParams());
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("apikey.map.qq.com/mkey/index.php/mkey/check", "map_nf_auth");
        hashMap.put("vectorsdk.map.qq.com/mvd_map", "map_nf_mvd");
        hashMap.put("vectorsdk.map.qq.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("p0.map.gtimg.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("vectorsdk.map.qq.com/indoormap2", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormap2/index", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormapx", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormapx/index", "map_nf_indoor");
        hashMap.put("tafrtt.map.qq.com/rttserverex/", "map_nf_trfc");
        hashMap.put("p0.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p1.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p2.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p3.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("apikey.map.qq.com/sdkapis/v1/cos_token", "map_nf_fileup");
        hashMap.put("overseactrl.map.qq.com", "map_nf_wdVer");
        hashMap.put("s0.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s1.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s2.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s3.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("confinfo.map.qq.com/confinfo", "map_nf_hdVer");
        hashMap.put("p0.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p1.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p2.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p3.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("sdkgw.map.qq.com/map/traffic/event", "map_nf_pnt");
        hashMap.put("sdkgw.map.qq.com/map/poi/detail", "map_nf_aoi");
        hashMap.put("mapapi.qq.com/sdk/", "map_nf_res");
        hashMap.put("wecar.myapp.com/myapp/mapwecar", "map_nf_res");
        hashMap.put("map.myapp.com/soso_map/", "map_nf_off");
        hashMap.put("pr.map.qq.com/ditusdk/monitor", "map_nf_pr");
        hashMap.put("s0.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s1.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s2.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s3.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("datalayer.map.qq.com/console/datalayer/data", "map_nf_visLyr");
        NetManager.init(context, arguments.setNetFlowRuleList(hashMap).setProcessor(ge.class).setProxyRuleList(e().b()));
    }

    private static HashMap<String, String> f() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("apikey.map.qq.com/mkey/index.php/mkey/check", "map_nf_auth");
        hashMap.put("vectorsdk.map.qq.com/mvd_map", "map_nf_mvd");
        hashMap.put("vectorsdk.map.qq.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("p0.map.gtimg.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("vectorsdk.map.qq.com/indoormap2", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormap2/index", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormapx", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormapx/index", "map_nf_indoor");
        hashMap.put("tafrtt.map.qq.com/rttserverex/", "map_nf_trfc");
        hashMap.put("p0.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p1.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p2.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p3.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("apikey.map.qq.com/sdkapis/v1/cos_token", "map_nf_fileup");
        hashMap.put("overseactrl.map.qq.com", "map_nf_wdVer");
        hashMap.put("s0.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s1.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s2.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s3.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("confinfo.map.qq.com/confinfo", "map_nf_hdVer");
        hashMap.put("p0.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p1.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p2.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p3.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("sdkgw.map.qq.com/map/traffic/event", "map_nf_pnt");
        hashMap.put("sdkgw.map.qq.com/map/poi/detail", "map_nf_aoi");
        hashMap.put("mapapi.qq.com/sdk/", "map_nf_res");
        hashMap.put("wecar.myapp.com/myapp/mapwecar", "map_nf_res");
        hashMap.put("map.myapp.com/soso_map/", "map_nf_off");
        hashMap.put("pr.map.qq.com/ditusdk/monitor", "map_nf_pr");
        hashMap.put("s0.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s1.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s2.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s3.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("datalayer.map.qq.com/console/datalayer/data", "map_nf_visLyr");
        return hashMap;
    }

    private void a(bn bnVar, TencentMapOptions tencentMapOptions) {
        Object protocolDataDesc = tencentMapOptions.getProtocolDataDesc();
        String str = bnVar.u().a;
        if (this.c == null) {
            this.c = g;
        }
        if (protocolDataDesc != null) {
            cc ccVar = null;
            int protocolFrom = tencentMapOptions.getProtocolFrom();
            if (protocolFrom == -1) {
                ccVar = a(bnVar, str, (String) protocolDataDesc);
            } else if (protocolFrom == 1) {
                ccVar = a(str, bnVar.getContext().getResources().openRawResource(((Integer) protocolDataDesc).intValue()));
            } else if (protocolFrom == 3) {
                ccVar = a(str, (String) protocolDataDesc);
            }
            if (ccVar != null) {
                this.c = ccVar;
            }
        }
        if (this.c == null) {
            this.c = g;
        } else {
            this.c.a = str;
            this.c.a(this);
        }
        f.push(this.c);
    }

    private cc a(bn bnVar, String str, String str2) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = bnVar.getContext().getResources().getAssets().open(str2);
            try {
                try {
                    cc a2 = a(str, inputStream);
                    kd.a((Closeable) inputStream);
                    return a2;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    kd.a((Closeable) inputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                kd.a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            kd.a((Closeable) inputStream2);
            throw th;
        }
    }

    private cc a(bn bnVar, String str, int i) {
        return a(str, bnVar.getContext().getResources().openRawResource(i));
    }

    private cc a(String str, InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (inputStream != null) {
            ByteArrayOutputStream byteArrayOutputStream2 = null;
            try {
                try {
                    byte[] bArr = new byte[1024];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (-1 != read) {
                                byteArrayOutputStream.write(bArr, 0, read);
                            } else {
                                cc a2 = a(str, new String(byteArrayOutputStream.toByteArray(), Charset.forName("UTF-8")));
                                kd.a(byteArrayOutputStream);
                                kd.a((Closeable) inputStream);
                                return a2;
                            }
                        } catch (IOException e) {
                            e = e;
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            e.printStackTrace();
                            kd.a(byteArrayOutputStream2);
                            kd.a((Closeable) inputStream);
                            return new cd();
                        } catch (Throwable th) {
                            th = th;
                            kd.a(byteArrayOutputStream);
                            kd.a((Closeable) inputStream);
                            throw th;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
            }
        }
        return new cd();
    }

    private cc a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString(ce.c, "-1");
            String optString2 = jSONObject.optString(ce.d, "_unknown");
            if (!"-1".equals(optString) && optString2.equals(str)) {
                cj cjVar = new cj();
                cjVar.a = str;
                cjVar.a(this);
                JSONArray optJSONArray = jSONObject.optJSONArray(ch.a_);
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        cjVar.a(optJSONArray.getJSONObject(i));
                    }
                }
                JSONObject optJSONObject = jSONObject.optJSONObject(cf.e);
                if (optJSONObject != null) {
                    cl clVar = (cl) JsonUtils.parseToModel(optJSONObject, cl.class, new Object[0]);
                    cn cnVar = cjVar.b;
                    cnVar.a = clVar.a;
                    cnVar.b = clVar.b;
                }
                return cjVar;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return g;
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void b(bn bnVar) {
        super.b(bnVar);
        if (f.isEmpty() || this.c == null) {
            return;
        }
        f.remove(this.c);
        this.c = null;
    }

    public final cc d() {
        if (this.c == null) {
            if (!f.isEmpty()) {
                this.c = f.peek();
            } else {
                this.c = g;
            }
        }
        return this.c;
    }

    public static cm e() {
        if (f.isEmpty()) {
            return new cn();
        }
        return f.peek().b;
    }

    public static <S extends ci> S a(Class<S> cls) {
        if (f.isEmpty()) {
            return (S) g.c(cls);
        }
        return (S) f.peek().c(cls);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol
    public TencentMapServiceProtocol.IMapService getMapService(String str) {
        ci b2;
        this.c = d();
        if (this.c == null || (b2 = this.c.b(str)) == null) {
            return null;
        }
        return new a(b2);
    }

    @Override // com.tencent.mapsdk.internal.cg
    public final Map<String, Class<? extends ch.a>> a() {
        HashMap hashMap = new HashMap();
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_AUTHORIZATION, dd.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_INDOOR_DATA, df.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_MAP_DATA, dh.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_MAP_STYLE, dj.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_RTT_DATA, dm.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_SATELLITE_DATA, dn.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_SKETCH_DATA, Cdo.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_OVERSEA_DATA, dl.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_STATISTIC, dp.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_TRAFFIC_EVENT, dq.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_OFFLINE_MAP_DATA, dk.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_MAP_POI_DATA, di.class);
        return hashMap;
    }

    @Override // com.tencent.mapsdk.internal.cg
    public final Map<String, String> c() {
        if (this.e != null) {
            b(a, this.e.getCustomUserId());
        }
        b(b, gy.e());
        return this.d;
    }

    private void b(String str, String str2) {
        if (hb.a(str2)) {
            return;
        }
        this.d.put(str, str2);
    }

    @Override // com.tencent.mapsdk.internal.cg
    public final List<Class<? extends p>> a_() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Basic.class);
        arrayList.add(Detail.class);
        arrayList.add(Response.class);
        arrayList.add(RttRequest.class);
        arrayList.add(RttResponse.class);
        arrayList.add(user_login_t.class);
        arrayList.add(CmdResult.class);
        arrayList.add(Header.class);
        arrayList.add(Package.class);
        arrayList.add(Tag.class);
        arrayList.add(CSFileUpdateReq.class);
        arrayList.add(FileUpdateReq.class);
        arrayList.add(FileUpdateRsp.class);
        arrayList.add(SCFileUpdateRsp.class);
        return arrayList;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static final class a implements TencentMapServiceProtocol.IMapService {
        ch.a a;

        public a(ch.a aVar) {
            this.a = aVar;
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.IMapService
        public final void setAllow(boolean z) {
            this.a.a(z);
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.IMapService
        public final void setUseTest(boolean z) {
            this.a.b(z);
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.IMapService
        public final void setUseHttps(boolean z) {
            this.a.c(z);
        }
    }
}
