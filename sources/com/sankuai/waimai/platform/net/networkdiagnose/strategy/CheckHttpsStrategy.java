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
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CheckHttpsStrategy extends a {
    private static final String HTTPS_KEY = "https-check";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String httpsUrl;

    @Override // com.sankuai.waimai.platform.net.networkdiagnose.strategy.a
    public String getName() {
        return "检查https连接是否可以建立";
    }

    public CheckHttpsStrategy(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7984053f1bade9229d234b86e0bb8c3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7984053f1bade9229d234b86e0bb8c3a");
        } else {
            this.httpsUrl = "https://api.meituan.com/user/smsmo";
        }
    }

    public CheckHttpsStrategy(Context context, com.sankuai.waimai.platform.net.networkdiagnose.a aVar) {
        super(context, aVar);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cd5712419fe522fbb491d8fadf3a010", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cd5712419fe522fbb491d8fadf3a010");
        } else {
            this.httpsUrl = "https://api.meituan.com/user/smsmo";
        }
    }

    @Override // com.sankuai.waimai.platform.net.networkdiagnose.strategy.a
    public void onDiagnose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84643034e178667fbfc10d81a725d80b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84643034e178667fbfc10d81a725d80b");
            return;
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(this.httpsUrl).openConnection());
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(10000);
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
            publishResult(HTTPS_KEY, jSONObject);
        } catch (MalformedURLException e) {
            publishResult(HTTPS_KEY, com.sankuai.waimai.platform.net.networkdiagnose.util.a.a(e));
        } catch (IOException e2) {
            publishResult(HTTPS_KEY, com.sankuai.waimai.platform.net.networkdiagnose.util.a.a(e2));
        } catch (JSONException e3) {
            publishResult(HTTPS_KEY, com.sankuai.waimai.platform.net.networkdiagnose.util.a.a(e3));
        }
    }
}
