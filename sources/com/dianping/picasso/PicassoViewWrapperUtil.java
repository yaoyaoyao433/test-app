package com.dianping.picasso;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.codelog.b;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.picasso.creator.AnimationViewWrapper;
import com.dianping.picasso.creator.BaseViewWrapper;
import com.dianping.picasso.creator.ButtonWrapper;
import com.dianping.picasso.creator.GroupViewWrapper;
import com.dianping.picasso.creator.ImageViewWrapper;
import com.dianping.picasso.creator.IndicatorWrapper;
import com.dianping.picasso.creator.InputViewWrapper;
import com.dianping.picasso.creator.ListItemViewWrapper;
import com.dianping.picasso.creator.ListViewWrapper;
import com.dianping.picasso.creator.RefreshViewWrapper;
import com.dianping.picasso.creator.ScrollViewWrapper;
import com.dianping.picasso.creator.SwitchViewWrapper;
import com.dianping.picasso.creator.TextViewWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoViewWrapperUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static HashMap<Integer, BaseViewWrapper> viewWrapperMap = new HashMap<>();
    public static final Map<Integer, String> sCachedViewMapping = new HashMap();
    private static boolean viewMappingLoadFail = false;

    private static void addInnerViewMapping() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dd45a5cd74b414b515ee462156e5f50e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dd45a5cd74b414b515ee462156e5f50e");
            return;
        }
        viewWrapperMap.put(0, new GroupViewWrapper());
        viewWrapperMap.put(1, new TextViewWrapper());
        viewWrapperMap.put(2, new ImageViewWrapper());
        viewWrapperMap.put(3, new ButtonWrapper());
        viewWrapperMap.put(8, new ListItemViewWrapper());
        viewWrapperMap.put(9, new ListViewWrapper());
        viewWrapperMap.put(10, new RefreshViewWrapper());
        viewWrapperMap.put(11, new ScrollViewWrapper());
        viewWrapperMap.put(14, new InputViewWrapper());
        viewWrapperMap.put(15, new IndicatorWrapper());
        viewWrapperMap.put(16, new AnimationViewWrapper());
        viewWrapperMap.put(17, new SwitchViewWrapper());
    }

    public static synchronized void loadViewMapping(@NonNull Context context) {
        synchronized (PicassoViewWrapperUtil.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c1c7ef4748ace636051b3cabcda9c10", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c1c7ef4748ace636051b3cabcda9c10");
                return;
            }
            if (viewWrapperMap.size() == 0 || viewMappingLoadFail) {
                buildViewMapping(context);
            }
        }
    }

    public static synchronized void buildViewMapping(Context context) {
        String[] split;
        synchronized (PicassoViewWrapperUtil.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "63be06e66e6b3ce5a829c6f89f4b41da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "63be06e66e6b3ce5a829c6f89f4b41da");
                return;
            }
            viewMappingLoadFail = false;
            PicassoEnvironment picassoEnvironment = PicassoEnvironment.getPicassoEnvironment(context);
            if (picassoEnvironment.appID < 0) {
                if (picassoEnvironment.isDebug) {
                    throw new RuntimeException("未正确设置Picasso的appid");
                }
                viewMappingLoadFail = true;
                b.b(PicassoViewWrapperUtil.class, "未正确设置Picasso的appid");
            }
            addInnerViewMapping();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("PicassoViewMapping_" + picassoEnvironment.appID)));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return;
                    }
                    String replaceAll = readLine.replaceAll(StringUtil.SPACE, "").replaceAll("\t", "");
                    int indexOf = replaceAll.indexOf("#");
                    if (indexOf != 0) {
                        if (indexOf > 0 && indexOf < replaceAll.length()) {
                            replaceAll = replaceAll.substring(0, indexOf);
                        }
                        if (replaceAll.contains(CommonConstant.Symbol.COLON) && (split = replaceAll.split(CommonConstant.Symbol.COLON)) != null && split.length >= 2) {
                            try {
                                int intValue = Integer.valueOf(split[0]).intValue();
                                String str = split[2];
                                viewWrapperMap.put(Integer.valueOf(intValue), (BaseViewWrapper) Class.forName(str).newInstance());
                                sCachedViewMapping.put(Integer.valueOf(intValue), str);
                            } catch (Exception e) {
                                b.a(PicassoViewWrapperUtil.class, "注册 View 失败: " + replaceAll);
                                e.printStackTrace();
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static boolean reloadViewWrapper(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ccfa9ab79eb08d2e76dee95fcfcc5ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ccfa9ab79eb08d2e76dee95fcfcc5ea")).booleanValue();
        }
        try {
            if (sCachedViewMapping.size() == 0) {
                loadViewMapping(PicassoEnvironment.globalContext);
            }
            String str = sCachedViewMapping.get(Integer.valueOf(i));
            if (TextUtils.isEmpty(str)) {
                Log.e("PicassoViewMap", "class is not found!!! type is " + i);
                return false;
            }
            Class<?> cls = Class.forName(str);
            if (cls == null) {
                Log.e("PicassoViewMap", "class is not found !!! type is " + i + "_className is " + str);
                return false;
            }
            viewWrapperMap.put(Integer.valueOf(i), (BaseViewWrapper) cls.newInstance());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static BaseViewWrapper viewWrapperByType(Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0f614a4ce9c8e5272cf160ee0825e2da", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseViewWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0f614a4ce9c8e5272cf160ee0825e2da");
        }
        BaseViewWrapper baseViewWrapper = viewWrapperMap.get(num);
        return (baseViewWrapper == null && reloadViewWrapper(num.intValue())) ? viewWrapperMap.get(num) : baseViewWrapper;
    }

    public static DecodingFactory viewModelFactoryByType(Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7332453f015c9504ffecd02a8e29d0eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (DecodingFactory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7332453f015c9504ffecd02a8e29d0eb");
        }
        BaseViewWrapper baseViewWrapper = viewWrapperMap.get(num);
        if (baseViewWrapper == null && reloadViewWrapper(num.intValue())) {
            baseViewWrapper = viewWrapperMap.get(num);
        }
        if (baseViewWrapper != null) {
            return baseViewWrapper.getDecodingFactory();
        }
        return null;
    }
}
