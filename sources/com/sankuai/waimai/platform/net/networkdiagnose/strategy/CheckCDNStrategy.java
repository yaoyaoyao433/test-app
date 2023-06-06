package com.sankuai.waimai.platform.net.networkdiagnose.strategy;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CheckCDNStrategy extends a {
    private static final String CDN_CHECK_P0 = "cdn_check_p0";
    private static final String CDN_CHECK_P1 = "cdn_check_p1";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String p0CdnUrl;
    private String p1CdnUrl;

    @Override // com.sankuai.waimai.platform.net.networkdiagnose.strategy.a
    public String getName() {
        return "检查CDN是否可以访问";
    }

    public CheckCDNStrategy(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e76a68b04225618b6fe91619848f9a5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e76a68b04225618b6fe91619848f9a5a");
            return;
        }
        this.p0CdnUrl = "http://p0.meituan.net/xianfu/87c794d86da3fa7b6411060a5b907d712048.png";
        this.p1CdnUrl = "http://p1.meituan.net/xianfu/87c794d86da3fa7b6411060a5b907d712048.png";
    }

    public CheckCDNStrategy(Context context, com.sankuai.waimai.platform.net.networkdiagnose.a aVar) {
        super(context, aVar);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "545966573a27951cacf1d76d9b9c0968", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "545966573a27951cacf1d76d9b9c0968");
            return;
        }
        this.p0CdnUrl = "http://p0.meituan.net/xianfu/87c794d86da3fa7b6411060a5b907d712048.png";
        this.p1CdnUrl = "http://p1.meituan.net/xianfu/87c794d86da3fa7b6411060a5b907d712048.png";
    }

    @Override // com.sankuai.waimai.platform.net.networkdiagnose.strategy.a
    public void onDiagnose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d7c47ac1cb72b04a4710dd3aec7a25c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d7c47ac1cb72b04a4710dd3aec7a25c");
            return;
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(this.p0CdnUrl).openConnection());
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            JSONObject jSONObject = new JSONObject();
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            for (String str : headerFields.keySet()) {
                List<String> list = headerFields.get(str);
                if (TextUtils.isEmpty(str)) {
                    str = "empty_header_key";
                }
                jSONObject.put(str, Arrays.toString(list.toArray()));
            }
            publishResult(CDN_CHECK_P0, jSONObject);
        } catch (MalformedURLException e) {
            publishResult(CDN_CHECK_P0, com.sankuai.waimai.platform.net.networkdiagnose.util.a.a(e));
        } catch (ProtocolException e2) {
            publishResult(CDN_CHECK_P0, com.sankuai.waimai.platform.net.networkdiagnose.util.a.a(e2));
        } catch (IOException e3) {
            publishResult(CDN_CHECK_P0, com.sankuai.waimai.platform.net.networkdiagnose.util.a.a(e3));
        } catch (JSONException e4) {
            publishResult(CDN_CHECK_P0, com.sankuai.waimai.platform.net.networkdiagnose.util.a.a(e4));
        }
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(this.p1CdnUrl).openConnection());
            httpURLConnection2.setRequestMethod("GET");
            httpURLConnection2.connect();
            JSONObject jSONObject2 = new JSONObject();
            Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
            for (String str2 : headerFields2.keySet()) {
                List<String> list2 = headerFields2.get(str2);
                if (TextUtils.isEmpty(str2)) {
                    str2 = "empty_header_key";
                }
                jSONObject2.put(str2, Arrays.toString(list2.toArray()));
            }
            publishResult(CDN_CHECK_P1, jSONObject2);
        } catch (MalformedURLException e5) {
            publishResult(CDN_CHECK_P1, com.sankuai.waimai.platform.net.networkdiagnose.util.a.a(e5));
        } catch (ProtocolException e6) {
            publishResult(CDN_CHECK_P1, com.sankuai.waimai.platform.net.networkdiagnose.util.a.a(e6));
        } catch (IOException e7) {
            publishResult(CDN_CHECK_P1, com.sankuai.waimai.platform.net.networkdiagnose.util.a.a(e7));
        } catch (JSONException e8) {
            publishResult(CDN_CHECK_P1, com.sankuai.waimai.platform.net.networkdiagnose.util.a.a(e8));
        }
    }
}
