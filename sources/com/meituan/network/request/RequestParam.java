package com.meituan.network.request;

import com.google.gson.JsonElement;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.titans.proxy.util.Constants;
import java.util.Map;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class RequestParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public JsonElement data;
    public Boolean enableShark;
    public Map<String, String> header;
    public boolean mtSecuritySign;
    public boolean mtSecuritySiua;
    public String requestDataType;
    @MsiParamChecker(required = true)
    public String url;
    public int timeout = 0;
    @MsiParamChecker(in = {"GET", Constants.KEY_METHOD_OPTIONS, "HEAD", "POST", OneIdNetworkTool.PUT, "DELETE", "TRACE", "CONNECT"})
    public String method = "GET";
    public String dataType = DaBaiDao.JSON_DATA;
}
