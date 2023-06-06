package com.meituan.android.common.horn;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.widget.c;
import com.meituan.android.common.horn.extra.uuid.IUUIDListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HornRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Map<String, HornCallback> mCallbacks;
    public HornCallback mHornCallback;
    public Map<String, Object> mHornQueryMap;
    public boolean mIsCacheInvalidate;
    public Map<String, String> mParams;
    public Map<String, Object> mPushLog;
    public String mType;

    public HornRequest(Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffde05a40edb10489a2887513abbbaba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffde05a40edb10489a2887513abbbaba");
            return;
        }
        this.mHornQueryMap = builder.mHornQueryMap;
        this.mPushLog = builder.mPushLog;
        this.mType = builder.mType;
        this.mHornCallback = builder.mCallback;
        this.mIsCacheInvalidate = builder.mIsCacheInvalidate;
        buildParames(builder);
    }

    public HornRequest(MixBuilder mixBuilder) {
        Object[] objArr = {mixBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "287d5548237e1f0bf8183e62d003c2d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "287d5548237e1f0bf8183e62d003c2d6");
            return;
        }
        this.mHornQueryMap = mixBuilder.mHornQueryMap;
        this.mCallbacks = mixBuilder.mCallbacks;
        this.mParams = mixBuilder.mParams;
        buildParames(mixBuilder);
    }

    private void buildParames(Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8130f6eb119f4e18ccf7cfeb516aeb62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8130f6eb119f4e18ccf7cfeb516aeb62");
            return;
        }
        try {
            final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            Map<String, ?> extraQuery = InnerHorn.getConfig().extraQuery();
            if (extraQuery != null) {
                concurrentHashMap.putAll(extraQuery);
            }
            String str = builder.mType;
            if (!TextUtils.isEmpty(str)) {
                concurrentHashMap.put("from", str);
            }
            concurrentHashMap.put("sdkVersion", HornUtils.getSdkVersion());
            concurrentHashMap.put("deviceType", Build.MODEL);
            concurrentHashMap.put("osVersion", Build.VERSION.RELEASE);
            concurrentHashMap.put("appVersion", HornUtils.getVersionName(builder.mContext));
            concurrentHashMap.put("packageName", HornUtils.getPackageName(builder.mContext));
            String obtainToken = HornUtils.obtainToken(builder.mContext);
            if (TextUtils.isEmpty(obtainToken)) {
                obtainToken = "";
            }
            concurrentHashMap.put("token", obtainToken);
            concurrentHashMap.put("is64", Boolean.valueOf(ProcessUtils.is64Bit()));
            HornConfiguration config = InnerHorn.getConfig();
            String loadUUIDFromSelfCache = config.uuidService() != null ? config.uuidService().loadUUIDFromSelfCache(builder.mContext) : null;
            if (!TextUtils.isEmpty(loadUUIDFromSelfCache)) {
                concurrentHashMap.put("id", loadUUIDFromSelfCache);
            } else if (config.uuidService() != null) {
                config.uuidService().getUUID(builder.mContext, new IUUIDListener() { // from class: com.meituan.android.common.horn.HornRequest.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.horn.extra.uuid.IUUIDListener
                    public void notify(Context context, String str2) {
                        Object[] objArr2 = {context, str2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "453dc2edacbd0b35f06ad6e110488a45", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "453dc2edacbd0b35f06ad6e110488a45");
                            return;
                        }
                        Map map = concurrentHashMap;
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "";
                        }
                        map.put("id", str2);
                    }
                });
            }
            concurrentHashMap.put("processName", ProcessUtils.getCurrentProcessName(builder.mContext));
            if (!(builder instanceof MixBuilder)) {
                Boolean bool = Boolean.FALSE;
                if (!TextUtils.isEmpty(str) && (bool = InnerHorn.TYPE_MAP.get(str)) == null) {
                    bool = Boolean.FALSE;
                }
                if (bool.booleanValue()) {
                    concurrentHashMap.put("os", "android_test");
                } else {
                    concurrentHashMap.put("os", "android");
                }
            }
            concurrentHashMap.put("version", c.c);
            concurrentHashMap.putAll(builder.mHornQueryMap);
            this.mHornQueryMap = concurrentHashMap;
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class MixBuilder extends Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Map<String, HornCallback> mCallbacks;
        private Map<String, String> mParams;

        public MixBuilder(Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "544867f9c8d39b420c75ea5e7c5c7acb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "544867f9c8d39b420c75ea5e7c5c7acb");
                return;
            }
            this.mCallbacks = new HashMap();
            this.mParams = new HashMap();
        }

        public final MixBuilder customerParamsMap(Map<String, String> map) {
            this.mParams = map;
            return this;
        }

        public final MixBuilder callback(Map<String, HornCallback> map) {
            this.mCallbacks = map;
            return this;
        }

        @Override // com.meituan.android.common.horn.HornRequest.Builder
        public final HornRequest build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b59810851f7ef36ed48dcbd5ed1b20b5", 6917529027641081856L)) {
                return (HornRequest) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b59810851f7ef36ed48dcbd5ed1b20b5");
            }
            if (this.mHornQueryMap == null) {
                this.mHornQueryMap = new HashMap();
            }
            return new HornRequest(this);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private HornCallback mCallback;
        private final Context mContext;
        public Map<String, Object> mHornQueryMap;
        private boolean mIsCacheInvalidate;
        private Map<String, Object> mPushLog;
        private String mType;

        public Builder(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8102efb25e76f686e136094f1c81929", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8102efb25e76f686e136094f1c81929");
                return;
            }
            this.mIsCacheInvalidate = false;
            this.mContext = context;
        }

        public Builder pushLog(Map<String, Object> map) {
            this.mPushLog = map;
            return this;
        }

        public Builder hornQueryMap(Map<String, Object> map) {
            this.mHornQueryMap = map;
            return this;
        }

        public Builder type(String str) {
            this.mType = str;
            return this;
        }

        public Builder callback(HornCallback hornCallback) {
            this.mCallback = hornCallback;
            return this;
        }

        public Builder invalidateCache() {
            this.mIsCacheInvalidate = true;
            return this;
        }

        public HornRequest build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce737384e00888cb6a5693870ffafec2", 6917529027641081856L)) {
                return (HornRequest) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce737384e00888cb6a5693870ffafec2");
            }
            if (this.mHornQueryMap == null) {
                this.mHornQueryMap = new HashMap();
            }
            return new HornRequest(this);
        }
    }
}
