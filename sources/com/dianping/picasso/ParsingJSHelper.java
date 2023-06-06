package com.dianping.picasso;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import com.dianping.codelog.b;
import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.SOLibraryLoader;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.picasso.model.params.TextViewParams;
import com.dianping.picassocontroller.a;
import com.dianping.picassocontroller.debug.c;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.android.soloader.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ParsingJSHelper {
    public static final String PICASSO_LOG_TAG = "picassoTag";
    public static final int TYPE_ERROR = 0;
    public static final int TYPE_INFO = 2;
    public static final int TYPE_WARNING = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static String extraJsString;
    private static RxJSExecutor mJSExecutor;
    @Deprecated
    public static Context sContext;
    public static PicassoEnvironment sPicassoEnvironment;
    private static final String[] FILES = {"picasso-main.js"};
    private static ParsingJSHelper instance = null;

    public static ParsingJSHelper getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d8bede75b9147322419f16355f2f74b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (ParsingJSHelper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d8bede75b9147322419f16355f2f74b1");
        }
        if (instance == null) {
            if (context == null) {
                Log.e(ParsingJSHelper.class.getName(), "ParsingJSHelper need context");
                return null;
            }
            synchronized (ParsingJSHelper.class) {
                if (instance == null) {
                    instance = new ParsingJSHelper(context);
                }
            }
        }
        return instance;
    }

    public ParsingJSHelper(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "030803f6fd2f7b9d52cb42a13363cdae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "030803f6fd2f7b9d52cb42a13363cdae");
            return;
        }
        sContext = context.getApplicationContext();
        if (SOLibraryLoader.sContext == null) {
            SOLibraryLoader.sContext = context.getApplicationContext();
        }
        if (SOLibraryLoader.sLogger == null) {
            SOLibraryLoader.sLogger = new SOLibraryLoader.Logger() { // from class: com.dianping.picasso.ParsingJSHelper.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.jscore.SOLibraryLoader.Logger
                public void log(String str, String str2) {
                    Object[] objArr2 = {str, str2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "939c5d93000c240e3972ef2a7a5838b2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "939c5d93000c240e3972ef2a7a5838b2");
                    } else {
                        b.b(SOLibraryLoader.class, str, str2);
                    }
                }
            };
        }
        k.a(context.getApplicationContext(), false);
        mJSExecutor = new RxJSExecutor(3);
        initTypeface(context);
        initJavaScriptInterface();
    }

    public RxJSExecutor getJSExecutor() {
        return mJSExecutor;
    }

    public static boolean isJSExecutorInit() {
        return mJSExecutor != null;
    }

    private void initTypeface(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1af2bbbd4ebc9823fa87cd40d6bf8e7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1af2bbbd4ebc9823fa87cd40d6bf8e7a");
        } else if (PicassoTextUtils.defaultTypeFace == null) {
            TextView textView = new TextView(context);
            textView.getPaint().setTypeface(Typeface.DEFAULT);
            PicassoTextUtils.defaultTypeFace = textView.getTypeface();
            for (Map.Entry<Integer, Integer> entry : TextViewParams.typefaceIntMap.entrySet()) {
                PicassoTextUtils.typefaceModeMap.put(entry.getKey(), Typeface.create(PicassoTextUtils.defaultTypeFace, entry.getValue().intValue()));
            }
        }
    }

    private void initJavaScriptInterface() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f18951b703e8a53e7bc3632f69cd5ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f18951b703e8a53e7bc3632f69cd5ad");
        } else if (mJSExecutor == null) {
        } else {
            injectJavaScript(getCoreJs());
            mJSExecutor.injectJSValue("Picasso", new Value(new Picasso(sContext)));
            injectEnvironment();
            mJSExecutor.injectJavaScriptInterface("picassoLog", new JavaScriptInterface() { // from class: com.dianping.picasso.ParsingJSHelper.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.jscore.JavaScriptInterface
                public Value exec(Value[] valueArr) {
                    Object[] objArr2 = {valueArr};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "383e4f43f0171c356c4d012f3ce1b341", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Value) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "383e4f43f0171c356c4d012f3ce1b341");
                    }
                    try {
                        String string = valueArr[0].string();
                        int intValue = valueArr[1].number().intValue();
                        switch (intValue) {
                            case 0:
                                Log.e(ParsingJSHelper.PICASSO_LOG_TAG, string);
                                break;
                            case 1:
                                break;
                            default:
                                intValue = 2;
                                break;
                        }
                        c.a().a(string, intValue);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return new Value();
                }
            });
            mJSExecutor.injectJavaScriptInterface("nativeRequire", new JavaScriptInterface() { // from class: com.dianping.picasso.ParsingJSHelper.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.jscore.JavaScriptInterface
                public Value exec(Value[] valueArr) {
                    Object[] objArr2 = {valueArr};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3b229f97b7a28d10fce3093147daa00c", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Value) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3b229f97b7a28d10fce3093147daa00c");
                    }
                    try {
                        String string = valueArr[0].string();
                        RxJSExecutor rxJSExecutor = ParsingJSHelper.mJSExecutor;
                        String generateRequireCode = ParsingJSHelper.this.generateRequireCode(string, a.a(string));
                        rxJSExecutor.loadJSCode(generateRequireCode, string + ".js");
                        return new Value(true);
                    } catch (ArchiveException e) {
                        e.printStackTrace();
                        return new Value(false);
                    }
                }
            });
        }
    }

    public String generateRequireCode(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83c10a0dab3530b4ae5183f9aa62b58e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83c10a0dab3530b4ae5183f9aa62b58e") : String.format("registerModule('%s',\n(function(__module){\nreturn (function(exports,module,require){\n    %s;\n    return module.exports;\n})(__module.exports,__module,require)\n})({exports:{}}))", str, str2);
    }

    public void injectEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a89793e75f6d9d42f2a36545abadbaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a89793e75f6d9d42f2a36545abadbaf");
            return;
        }
        if (sPicassoEnvironment == null) {
            sPicassoEnvironment = PicassoEnvironment.getPicassoEnvironment(sContext);
        }
        mJSExecutor.injectJSValue("PCSEnvironment", new Value(sPicassoEnvironment));
    }

    public String getCoreJs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da28220d3773f560382a066ecc27ba20", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da28220d3773f560382a066ecc27ba20");
        }
        return PicassoUtils.getFromAssets(sContext, FILES) + "\n" + extraJsString;
    }

    public static String getString(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "43308b5b09d2f58ca59710ead79c68b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "43308b5b09d2f58ca59710ead79c68b8");
        }
        byte[] bytes = getBytes(file);
        if (bytes != null) {
            return new String(bytes, Charset.forName("UTF-8"));
        }
        return null;
    }

    public static byte[] getBytes(File file) {
        RandomAccessFile randomAccessFile;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba8019a47e8d8d6948521e7d6739c998", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba8019a47e8d8d6948521e7d6739c998");
        }
        try {
            randomAccessFile = new RandomAccessFile(file, r.o);
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.read(bArr);
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bArr;
        } catch (Throwable th2) {
            th = th2;
            try {
                th.printStackTrace();
                return null;
            } finally {
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    public void injectJavaScript(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de9e0d12df39eeccf8a4caaaf5429f06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de9e0d12df39eeccf8a4caaaf5429f06");
        } else if (mJSExecutor == null || TextUtils.isEmpty(str)) {
        } else {
            RxJSExecutor rxJSExecutor = mJSExecutor;
            rxJSExecutor.loadJSCode("\n" + str, "unknown");
        }
    }

    public static void setExtraJs(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0fbdb40aa311d954760c5cd07c20c4ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0fbdb40aa311d954760c5cd07c20c4ad");
            return;
        }
        String str2 = "\n" + str + "\n";
        extraJsString += str2;
        if (instance != null) {
            instance.injectJavaScript(str2);
        }
    }
}
