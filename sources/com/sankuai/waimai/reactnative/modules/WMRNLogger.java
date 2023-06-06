package com.sankuai.waimai.reactnative.modules;

import android.text.TextUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.widget.emptylayout.h;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNLogger extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "WMRNLogger";
    }

    public WMRNLogger(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "637e8285b1d6d5933e0234933e4eb867", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "637e8285b1d6d5933e0234933e4eb867");
        }
    }

    @ReactMethod
    public void error(String str, String str2, String str3, boolean z, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba1407cc03e588dd8a31e4bdc9030c99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba1407cc03e588dd8a31e4bdc9030c99");
            return;
        }
        try {
            String str4 = TextUtils.isEmpty(str) ? "rn_page_error" : str;
            i.d(new com.sankuai.waimai.reactnative.log.a().a(str4).b(str2).d(convertToLog(readableMap)).b(true).a(z).b());
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            h.a(str4, h.c, str3);
        } catch (Exception e) {
            if (com.sankuai.waimai.foundation.core.a.b()) {
                throw e;
            }
        }
    }

    @ReactMethod
    public void normal(String str, String str2, String str3, boolean z, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b888cb4dc2c937e7598e402f07df1dfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b888cb4dc2c937e7598e402f07df1dfb");
            return;
        }
        try {
            String str4 = TextUtils.isEmpty(str) ? "rn_page_error" : str;
            i.c(new com.sankuai.waimai.reactnative.log.a().a(str4).b(str2).d(convertToLog(readableMap)).b(true).a(z).b());
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            h.a(str4, h.c, str3);
        } catch (Exception e) {
            if (com.sankuai.waimai.foundation.core.a.b()) {
                throw e;
            }
        }
    }

    private String convertToLog(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "782df14cd37d99832a343f6a31622f31", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "782df14cd37d99832a343f6a31622f31");
        }
        StringBuilder sb = new StringBuilder();
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                ReadableType type = readableMap.getType(nextKey);
                sb.append(nextKey);
                sb.append("=");
                switch (type) {
                    case Null:
                        sb.append(StringUtil.NULL);
                        break;
                    case Map:
                    case Array:
                        break;
                    case Boolean:
                        sb.append(readableMap.getBoolean(nextKey));
                        continue;
                        sb.append("&");
                    case Number:
                        sb.append(readableMap.getDouble(nextKey));
                        continue;
                        sb.append("&");
                    case String:
                        sb.append(readableMap.getString(nextKey));
                        continue;
                        sb.append("&");
                    default:
                        sb.append("&");
                }
                sb.append("暂不支持复杂数据类型");
                sb.append("&");
            }
        }
        return sb.toString();
    }
}
