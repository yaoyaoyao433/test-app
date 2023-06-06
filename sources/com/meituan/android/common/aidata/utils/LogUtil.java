package com.meituan.android.common.aidata.utils;

import android.util.Log;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LogUtil {
    private static boolean LOG_SWITCH = false;
    private static char LOG_TYPE = 'v';
    public static final String TAG_AI_DATA = "ai_data";
    public static ChangeQuickRedirect changeQuickRedirect;
    public static List<AILogListener> mAILogListenerList = new ArrayList();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface AILogListener {
        void d(String str);

        void e(String str);

        void l(String str);

        void w(String str);
    }

    public static void printDebugInfo(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a7e7d3347504c2df1d277e586003f71f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a7e7d3347504c2df1d277e586003f71f");
        }
    }

    public static void enable(boolean z) {
        LOG_SWITCH = z;
    }

    public static boolean isLogEnabled() {
        return LOG_SWITCH;
    }

    public static void w(String str, Object obj, Throwable th) {
        Object[] objArr = {str, obj, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "61a43d719bc54c72628a3fa795f24c32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "61a43d719bc54c72628a3fa795f24c32");
        } else if (obj != null) {
            log(Constants.SDK_LOG_TAG, str + obj.toString(), 'w', th);
        }
    }

    public static void e(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb12384472e6686d16106af6436a369a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb12384472e6686d16106af6436a369a");
        } else if (obj != null) {
            log(Constants.SDK_LOG_TAG, str + StringUtil.SPACE + obj.toString(), 'e', null);
        }
    }

    public static void e(String str, Object obj, Throwable th) {
        Object[] objArr = {str, obj, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4baaa07525e7396ac1026dcc340335df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4baaa07525e7396ac1026dcc340335df");
        } else if (obj != null) {
            log(Constants.SDK_LOG_TAG, str + StringUtil.SPACE + obj.toString(), 'e', th);
        }
    }

    public static void d(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a802a4402b66631b04098d99da56e73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a802a4402b66631b04098d99da56e73");
        } else if (obj != null) {
            log(Constants.SDK_LOG_TAG, obj.toString(), 'd', null);
        }
    }

    public static void i(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bb8efbe8111ea23888f78f67b96c4e1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bb8efbe8111ea23888f78f67b96c4e1f");
        } else if (str == null || obj == null) {
        } else {
            log(Constants.SDK_LOG_TAG, str + StringUtil.SPACE + obj.toString(), 'i', null);
        }
    }

    public static void v(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c41c6a6b77cd8a39ce4d88c2cf71a43e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c41c6a6b77cd8a39ce4d88c2cf71a43e");
        } else if (obj != null) {
            log(Constants.SDK_LOG_TAG, str + StringUtil.SPACE + obj.toString(), 'v', null);
        }
    }

    public static void dKeyStep(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f3381ad5620c663d720ca323dad3bfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f3381ad5620c663d720ca323dad3bfe");
        } else if (obj != null) {
            log(Constants.SDK_LOG_TAG, "key step: " + obj.toString(), 'd', null);
        }
    }

    public static void eKeyStep(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2fe905c5631a068f28aa880bdd186c0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2fe905c5631a068f28aa880bdd186c0b");
        } else if (obj != null) {
            log(Constants.SDK_LOG_TAG, str + " key step: " + obj.toString(), 'e', null);
        }
    }

    private static void log(String str, String str2, char c, Throwable th) {
        Object[] objArr = {str, str2, Character.valueOf(c), th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75ea6d53451d76c79d116f81e54f3406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75ea6d53451d76c79d116f81e54f3406");
        } else if (LOG_SWITCH) {
            if ('e' == c && ('e' == LOG_TYPE || 'v' == LOG_TYPE)) {
                Log.e(str, str2, th);
            } else if ('w' == c) {
                if ('w' == LOG_TYPE || 'v' == LOG_TYPE) {
                    Log.w(str, str2, th);
                }
            }
        }
    }

    public static void aiLogD(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9d8c93f318b853ad8e24e3770616f789", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9d8c93f318b853ad8e24e3770616f789");
        } else if (AIDataDelegate.getInstance().isDebugEnable()) {
            notifyAILog('l', str);
        }
    }

    public static void aiLogE(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "55533fef4432b6cefcc23d09047721ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "55533fef4432b6cefcc23d09047721ff");
        } else if (AIDataDelegate.getInstance().isDebugEnable()) {
            notifyAILog('l', str + CommonConstant.Symbol.COLON + str2);
        }
    }

    public static void registerAILogListener(AILogListener aILogListener) {
        Object[] objArr = {aILogListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f0016227a8d3bedf116b5380fbb7bf07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f0016227a8d3bedf116b5380fbb7bf07");
        } else {
            mAILogListenerList.add(aILogListener);
        }
    }

    public static void clearAILogListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b21041878feb68e826852205298bf245", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b21041878feb68e826852205298bf245");
        } else {
            mAILogListenerList.clear();
        }
    }

    private static void notifyAILog(char c, String str) {
        Object[] objArr = {Character.valueOf(c), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9b673e34e15a8568d06d0a00486e282", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9b673e34e15a8568d06d0a00486e282");
            return;
        }
        for (AILogListener aILogListener : mAILogListenerList) {
            if (c == 'l') {
                aILogListener.l(str);
            } else if (c == 'w') {
                aILogListener.w(str);
            } else {
                switch (c) {
                    case 'd':
                        aILogListener.d(str);
                        continue;
                    case 'e':
                        aILogListener.e(str);
                        continue;
                }
            }
        }
    }
}
