package com.sankuai.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RequestUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static HttpUriRequest buildFormEntityRequest(String str, List<BasicNameValuePair> list) {
        HttpEntity httpEntity;
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d2067b728c4ce7dad077f45a1adf7e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpUriRequest) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d2067b728c4ce7dad077f45a1adf7e5");
        }
        HttpPost httpPost = new HttpPost(str);
        try {
            httpEntity = new UrlEncodedFormEntity(list, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            httpEntity = null;
        }
        httpPost.setEntity(httpEntity);
        return httpPost;
    }

    public static HttpUriRequest buildStringEntityRequest(String str, String str2) {
        HttpEntity httpEntity;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "898d44342a28137f21581d637d9bf32c", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpUriRequest) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "898d44342a28137f21581d637d9bf32c");
        }
        HttpPost httpPost = new HttpPost(str);
        try {
            httpEntity = new StringEntity(str2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            httpEntity = null;
        }
        httpPost.setEntity(httpEntity);
        return httpPost;
    }

    public static HttpUriRequest buildStringEntityRequest(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f759efecb25ef0d8574cd3e17ea0e955", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpUriRequest) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f759efecb25ef0d8574cd3e17ea0e955");
        }
        HttpPost httpPost = new HttpPost(str);
        try {
            StringEntity stringEntity = new StringEntity(str2, "UTF-8");
            stringEntity.setContentType(str3);
            httpPost.setEntity(stringEntity);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return httpPost;
    }
}
