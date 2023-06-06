package com.dianping.titans.js.jshandler;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.UIUtil;
import com.sankuai.meituan.android.knb.util.WebUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetStatusBarStyleJsHandler extends BaseJsHandler {
    public static final int COLOR_APPROACH_WHITE = -1118482;
    public static ChangeQuickRedirect changeQuickRedirect;

    private int checkColor(int i) {
        return i > -1118482 ? COLOR_APPROACH_WHITE : i;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11bfd602db846e5f08ec88df5ce15897", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11bfd602db846e5f08ec88df5ce15897");
            return;
        }
        try {
            JSONObject jSONObject = jsBean().argsJson;
            setStatusBar(jSONObject.optInt("style", -1), WebUtil.getRGBAColor(jSONObject.optString("backgroundColor")));
            jsCallback();
        } catch (Exception e) {
            jsCallbackErrorMsg(e.getMessage());
        }
    }

    private void setStatusBar(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "416c1cbd751c7791c28daafd36f96086", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "416c1cbd751c7791c28daafd36f96086");
            return;
        }
        Window window = jsHost().getActivity().getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i2);
            setStatusBarStyle(window, i);
        } else if (Build.VERSION.SDK_INT >= 19) {
            window.addFlags(67108864);
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) window.getDecorView()).getChildAt(0);
            View findViewById = viewGroup.findViewById(16908314);
            if (findViewById == null) {
                findViewById = new View(viewGroup.getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, UIUtil.getStatusBarHeight(viewGroup.getContext()));
                findViewById.setId(16908314);
                findViewById.setLayoutParams(layoutParams);
                viewGroup.addView(findViewById, 0);
            }
            findViewById.setBackgroundColor(checkColor(i2));
        }
    }

    private void setStatusBarStyle(Window window, int i) {
        Object[] objArr = {window, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5723409bc80fc6b64e8bfd143fd6f9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5723409bc80fc6b64e8bfd143fd6f9a");
        } else if (i == -1 || setStatusBarStyleForSpecial(window, i) || Build.VERSION.SDK_INT < 23) {
        } else {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(i == 0 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    private boolean setStatusBarStyleForSpecial(Window window, int i) {
        Object[] objArr = {window, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ecba329f6df68edb395b49b7c7fe5dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ecba329f6df68edb395b49b7c7fe5dc")).booleanValue();
        }
        if (Build.VERSION.SDK_INT == 23) {
            try {
                String property = System.getProperty("http.agent");
                if (!TextUtils.isEmpty(property) && !Build.BRAND.contains("mi") && property.toLowerCase().contains("miui")) {
                    Class<?> cls = window.getClass();
                    Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                    int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                    Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Integer.valueOf(i == 0 ? i2 : 0);
                    objArr2[1] = Integer.valueOf(i2);
                    method.invoke(window, objArr2);
                    return true;
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (NoSuchFieldException e3) {
                e3.printStackTrace();
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
            }
        }
        return false;
    }
}
