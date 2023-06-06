package com.hhmedic.android.sdk.module.video.data;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.hhmedic.android.sdk.base.controller.HHDataController;
import com.hhmedic.android.sdk.base.controller.HHDataControllerListener;
import com.hhmedic.android.sdk.base.model.HHEmptyModel;
import com.hhmedic.android.sdk.base.model.HHModel;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import com.hhmedic.android.sdk.base.user.Caches;
import com.hhmedic.android.sdk.base.utils.Maps;
import com.meituan.android.common.mrn.analytics.library.Constants;
import java.lang.reflect.Type;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CommentDC extends HHDataController<HHEmptyModel> {
    public CommentDC(Context context) {
        super(context);
    }

    public void create(String str, int i, String str2, HHDataControllerListener hHDataControllerListener) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        request(new FeedbackCreate(Maps.of(Constants.EventConstants.KEY_ORDER_ID, str, "questionId", Integer.valueOf(i), "answer", str2)), hHDataControllerListener);
    }

    public void rate(String str, String str2, int i, HHDataControllerListener hHDataControllerListener) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String str3 = str;
        String uuid = Caches.getUUID(this.mContext);
        if (TextUtils.isEmpty(uuid)) {
            uuid = "";
        }
        HashMap<String, Object> of = Maps.of("orderid", str3, "content", str2, "uuid", uuid);
        of.put("rate", Integer.valueOf(i));
        request(new RateConfig(of), hHDataControllerListener);
    }

    public void feedback(String str, String str2, HHDataControllerListener hHDataControllerListener) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String str3 = str;
        String uuid = Caches.getUUID(this.mContext);
        if (TextUtils.isEmpty(uuid)) {
            uuid = "";
        }
        request(new RateConfig(Maps.of("orderid", str3, "complaintContent", str2, "uuid", uuid)), hHDataControllerListener);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class FeedbackCreate extends HHRequestConfig {
        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public String serverApiPath() {
            return "/feedback/create";
        }

        FeedbackCreate(HashMap<String, Object> hashMap) {
            super(hashMap, null);
        }

        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public Type parserJsonType() {
            return new TypeToken<HHModel<HHEmptyModel>>() { // from class: com.hhmedic.android.sdk.module.video.data.CommentDC.FeedbackCreate.1
            }.getType();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class RateConfig extends HHRequestConfig {
        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public String serverApiPath() {
            return "/feedback/save";
        }

        RateConfig(HashMap<String, Object> hashMap) {
            super(null, hashMap);
        }

        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public Type parserJsonType() {
            return new TypeToken<HHModel<HHEmptyModel>>() { // from class: com.hhmedic.android.sdk.module.video.data.CommentDC.RateConfig.1
            }.getType();
        }
    }
}
