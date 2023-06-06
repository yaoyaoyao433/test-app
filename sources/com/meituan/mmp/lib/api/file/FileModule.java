package com.meituan.mmp.lib.api.file;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.config.a;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.bg;
import com.meituan.mmp.lib.utils.g;
import com.meituan.mmp.lib.utils.q;
import com.meituan.mmp.lib.utils.r;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.lib.utils.x;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mtwebkit.MTURLUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.tencent.smtt.sdk.TbsReaderView;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FileModule extends ServiceApi {
    public static ChangeQuickRedirect a;
    private String h;
    private String i;
    private String j;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "357b7b57bd8e8d9aabcd2c34c2c72b5c", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "357b7b57bd8e8d9aabcd2c34c2c72b5c") : new String[]{"saveFile", "saveFileSync", "getFileInfo", "getSavedFileList", "getSavedFileInfo", "removeSavedFile", "access", "accessSync", "fs_appendFile", "fs_appendFileSync", "writeFile", "writeFileSync", "readFile", "readFileSync", "fs_copyFile", "fs_copyFileSync", "mkdir", "mkdirSync", "readdir", "readdirSync", "fs_rename", "fs_renameSync", "rmdir", "rmdirSync", "unlink", "unlinkSync", "unzip", "stat", "statSync"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void beforeFirstInvoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f096423e39fc80f91a06ec30059ad0e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f096423e39fc80f91a06ec30059ad0e1");
            return;
        }
        super.beforeFirstInvoke();
        a appConfig = getAppConfig();
        Context context = MMPEnvHelper.getContext();
        this.h = s.a(appConfig, context);
        this.i = s.b(appConfig, context);
        this.j = s.c(appConfig, context);
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        String str2;
        String substring;
        String str3;
        String str4;
        int i;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        String a2;
        boolean mkdir;
        String a3;
        String a4;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dcb7cd23eef20fa3b2bbe8eeb1fadfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dcb7cd23eef20fa3b2bbe8eeb1fadfb");
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2073025383:
                if (str.equals("saveFile")) {
                    c = 0;
                    break;
                }
                break;
            case -1995982721:
                if (str.equals("removeSavedFile")) {
                    c = 2;
                    break;
                }
                break;
            case -1851209669:
                if (str.equals("getSavedFileInfo")) {
                    c = 5;
                    break;
                }
                break;
            case -1851124693:
                if (str.equals("getSavedFileList")) {
                    c = 4;
                    break;
                }
                break;
            case -1791136477:
                if (str.equals("fs_appendFileSync")) {
                    c = '\t';
                    break;
                }
                break;
            case -1574561970:
                if (str.equals("unlinkSync")) {
                    c = 25;
                    break;
                }
                break;
            case -1528590803:
                if (str.equals("rmdirSync")) {
                    c = 23;
                    break;
                }
                break;
            case -1423461020:
                if (str.equals("access")) {
                    c = 6;
                    break;
                }
                break;
            case -1406748165:
                if (str.equals("writeFile")) {
                    c = '\n';
                    break;
                }
                break;
            case -1142033889:
                if (str.equals("accessSync")) {
                    c = 7;
                    break;
                }
                break;
            case -867956686:
                if (str.equals("readFile")) {
                    c = '\f';
                    break;
                }
                break;
            case -840447469:
                if (str.equals("unlink")) {
                    c = 24;
                    break;
                }
                break;
            case -799949100:
                if (str.equals("saveFileSync")) {
                    c = 1;
                    break;
                }
                break;
            case -734079374:
                if (str.equals("readdirSync")) {
                    c = 19;
                    break;
                }
                break;
            case -271906454:
                if (str.equals("mkdirSync")) {
                    c = 17;
                    break;
                }
                break;
            case -145518141:
                if (str.equals("fs_copyFile")) {
                    c = 14;
                    break;
                }
                break;
            case 3540564:
                if (str.equals("stat")) {
                    c = 27;
                    break;
                }
                break;
            case 103950895:
                if (str.equals("mkdir")) {
                    c = 16;
                    break;
                }
                break;
            case 108628082:
                if (str.equals("rmdir")) {
                    c = 22;
                    break;
                }
                break;
            case 111449576:
                if (str.equals("unzip")) {
                    c = 26;
                    break;
                }
                break;
            case 470189822:
                if (str.equals("fs_copyFileSync")) {
                    c = 15;
                    break;
                }
                break;
            case 656840432:
                if (str.equals("fs_rename")) {
                    c = 20;
                    break;
                }
                break;
            case 1045779048:
                if (str.equals("fs_appendFile")) {
                    c = '\b';
                    break;
                }
                break;
            case 1080408887:
                if (str.equals("readdir")) {
                    c = 18;
                    break;
                }
                break;
            case 1317686031:
                if (str.equals("statSync")) {
                    c = 28;
                    break;
                }
                break;
            case 1342041536:
                if (str.equals("getFileInfo")) {
                    c = 3;
                    break;
                }
                break;
            case 1713034038:
                if (str.equals("writeFileSync")) {
                    c = 11;
                    break;
                }
                break;
            case 1934175659:
                if (str.equals("fs_renameSync")) {
                    c = 21;
                    break;
                }
                break;
            case 2112368109:
                if (str.equals("readFileSync")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                Object[] objArr2 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66daa1c59e5f4829d9491cfae617c7bc", RobustBitConfig.DEFAULT_VALUE)) {
                    String optString = jSONObject.optString("tempFilePath");
                    String optString2 = jSONObject.optString(TbsReaderView.KEY_FILE_PATH);
                    if (!TextUtils.isEmpty(optString)) {
                        if (!TextUtils.isEmpty(optString2)) {
                            String a5 = a(optString2, iApiCallback);
                            if (a5 != null) {
                                if (!q.a(a5, this.j)) {
                                    iApiCallback.onFail(a("permission denied, open \"%s\"", optString));
                                    break;
                                } else {
                                    File file = new File(a5);
                                    if (!file.getParentFile().exists()) {
                                        iApiCallback.onFail(a("no such file or directory \"%s\"", optString2));
                                        break;
                                    } else {
                                        str2 = file.getAbsolutePath();
                                    }
                                }
                            }
                        } else {
                            str2 = null;
                        }
                        if (optString.startsWith("wdfile://")) {
                            substring = new File(this.h, optString.substring(9)).getAbsolutePath();
                        } else {
                            substring = optString.startsWith(MTURLUtil.FILE_BASE) ? optString.substring(5) : optString;
                        }
                        File file2 = new File(substring);
                        b.b("saveFile", "tempFilePath:" + substring);
                        b.b("saveFile", "tempFile: " + file2);
                        if (TextUtils.isEmpty(substring)) {
                            b.b("saveFile", "file path id not exit");
                            iApiCallback.onFail(a("%s file not exist", optString + "file path is not exit"));
                            break;
                        } else if (!file2.exists() || !file2.isFile()) {
                            if (!file2.exists()) {
                                b.b("saveFile", "tempFile is not exit");
                                iApiCallback.onFail(a("%s file not exist", optString + "tempFile is not exit"));
                                break;
                            } else {
                                b.b("saveFile", "tempFile is not a file");
                                iApiCallback.onFail(a("%s file not exist", optString + "tempFile is not a file"));
                                break;
                            }
                        } else if (TextUtils.isEmpty(substring) || !file2.exists() || !file2.isFile()) {
                            iApiCallback.onFail(a("%s file not exist", optString));
                            break;
                        } else if (!q.a(file2, getAppConfig().e(getContext()))) {
                            q.a(iApiCallback);
                            break;
                        } else {
                            if (a((int) file2.length(), optString2 + StringUtil.SPACE + substring)) {
                                if (TextUtils.isEmpty(str2)) {
                                    str4 = "store_" + s.b(file2) + s.c(substring);
                                    str3 = d(this.i) + File.separator + str4;
                                } else {
                                    str3 = str2;
                                    str4 = str3;
                                }
                                b.b("saveFile", "saveName:" + str4);
                                File file3 = new File(str3);
                                file3.delete();
                                b.b("saveFile", "saveFilePath" + str3);
                                b.b("saveFile", "saveFile" + file3);
                                if (!file2.renameTo(file3)) {
                                    iApiCallback.onFail(a("permission denied, open \"%s\"", str3));
                                } else if (file3.exists()) {
                                    getSharedPreferences().edit().putLong(str4, System.currentTimeMillis()).apply();
                                    try {
                                        JSONObject jSONObject2 = new JSONObject();
                                        if (TextUtils.isEmpty(optString2)) {
                                            jSONObject2.put("savedFilePath", "wdfile://" + str4);
                                        } else {
                                            jSONObject2.put("savedFilePath", optString2);
                                        }
                                        iApiCallback.onSuccess(jSONObject2);
                                        file2.delete();
                                        break;
                                    } catch (Exception unused) {
                                        b.d("InnerApi", "saveFile assemble result exception!");
                                    }
                                } else {
                                    iApiCallback.onFail();
                                }
                                iApiCallback.onFail();
                                break;
                            } else {
                                iApiCallback.onFail(a("the maximum size of the file storage limit is exceeded", new Object[0]));
                                break;
                            }
                        }
                    } else {
                        iApiCallback.onFail(a("%s file not exist", optString));
                        break;
                    }
                } else {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66daa1c59e5f4829d9491cfae617c7bc");
                    break;
                }
                break;
            case 2:
                Object[] objArr3 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "330bd42e4aa959af8f0669eac2a3fbbc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "330bd42e4aa959af8f0669eac2a3fbbc");
                    break;
                } else {
                    String optString3 = jSONObject.optString(TbsReaderView.KEY_FILE_PATH);
                    if (!TextUtils.isEmpty(optString3) && optString3.startsWith("wdfile://")) {
                        String a6 = a(optString3);
                        if (TextUtils.isEmpty(a6)) {
                            iApiCallback.onFail(a("not a store filePath", new Object[0]));
                            break;
                        } else {
                            File file4 = new File(a6);
                            if (file4.exists()) {
                                file4.delete();
                                iApiCallback.onSuccess(null);
                            } else {
                                i = 1;
                                iApiCallback.onFail(a(String.format("%s file not exist", ""), new Object[0]));
                                Object[] objArr4 = new Object[i];
                                objArr4[0] = optString3;
                                iApiCallback.onFail(a("permission denied, open \"%s\"", objArr4));
                                break;
                            }
                        }
                    }
                    i = 1;
                    Object[] objArr42 = new Object[i];
                    objArr42[0] = optString3;
                    iApiCallback.onFail(a("permission denied, open \"%s\"", objArr42));
                }
                break;
            case 3:
                Object[] objArr5 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (!PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "ec101fb85e706a7be9d696b07cd1a858", RobustBitConfig.DEFAULT_VALUE)) {
                    String optString4 = jSONObject.optString(TbsReaderView.KEY_FILE_PATH);
                    String optString5 = jSONObject.optString("digestAlgorithm");
                    if (TextUtils.isEmpty(optString5)) {
                        optString5 = "md5";
                    }
                    if (!TextUtils.isEmpty(optString4)) {
                        String a7 = a(optString4, iApiCallback);
                        if (a7 != null) {
                            if (!q.a(a7, getAppConfig().e(getContext()))) {
                                q.a(iApiCallback);
                                break;
                            } else if (new File(a7).exists()) {
                                try {
                                    long a8 = r.a(new File(a7));
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, a8);
                                    if ("md5".equals(optString5)) {
                                        jSONObject3.put("digest", s.b(new File(a7)));
                                    } else {
                                        jSONObject3.put("digest", s.b(a7));
                                    }
                                    iApiCallback.onSuccess(jSONObject3);
                                    break;
                                } catch (Exception unused2) {
                                    b.d("InnerApi", "getFileInfo assemble result exception!");
                                }
                            }
                        }
                    }
                    iApiCallback.onFail();
                    break;
                } else {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "ec101fb85e706a7be9d696b07cd1a858");
                    break;
                }
                break;
            case 4:
                a(iApiCallback);
                break;
            case 5:
                Object[] objArr6 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (!PatchProxy.isSupport(objArr6, this, changeQuickRedirect5, false, "d9f2ed163224a70865cdcb66509697da", RobustBitConfig.DEFAULT_VALUE)) {
                    String optString6 = jSONObject.optString(TbsReaderView.KEY_FILE_PATH);
                    String a9 = a(optString6);
                    if (!TextUtils.isEmpty(a9)) {
                        if (!q.a(a9, getAppConfig().e(getContext()))) {
                            q.a(iApiCallback);
                            break;
                        } else {
                            try {
                                File file5 = new File(a9);
                                if (!file5.exists()) {
                                    iApiCallback.onFail(a("file not find", new Object[0]));
                                } else {
                                    long a10 = r.a(file5);
                                    long j = getSharedPreferences().getLong(new File(a9).getName(), -1L);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, a10);
                                    jSONObject4.put("createTime", j);
                                    iApiCallback.onSuccess(jSONObject4);
                                }
                                break;
                            } catch (Exception unused3) {
                                b.d("InnerApi", "getSavedFileInfo assemble result exception!");
                            }
                        }
                    }
                    iApiCallback.onFail(a("no such file %s", optString6));
                    break;
                } else {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect5, false, "d9f2ed163224a70865cdcb66509697da");
                    break;
                }
            case 6:
            case 7:
                Object[] objArr7 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (!PatchProxy.isSupport(objArr7, this, changeQuickRedirect6, false, "9d9b2428cd1d6a7766bb53c6d2d8c8cb", RobustBitConfig.DEFAULT_VALUE)) {
                    String optString7 = jSONObject.optString("path");
                    String a11 = a(optString7, iApiCallback);
                    if (a11 != null) {
                        if (!q.a(a11, getAppConfig().e(getContext()))) {
                            q.a(iApiCallback);
                            break;
                        } else if (!new File(a11).exists()) {
                            iApiCallback.onFail(a("no such file or directory \"%s\"", optString7));
                            break;
                        } else {
                            iApiCallback.onSuccess(null);
                            break;
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect6, false, "9d9b2428cd1d6a7766bb53c6d2d8c8cb");
                    break;
                }
                break;
            case '\b':
            case '\t':
                Object[] objArr8 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (!PatchProxy.isSupport(objArr8, this, changeQuickRedirect7, false, "e4b111bb4b88309aa1e1203d836a908f", RobustBitConfig.DEFAULT_VALUE)) {
                    String optString8 = jSONObject.optString(TbsReaderView.KEY_FILE_PATH);
                    String optString9 = jSONObject.optString("data");
                    if (TextUtils.isEmpty(optString9)) {
                        iApiCallback.onSuccess(null);
                        break;
                    } else {
                        String optString10 = jSONObject.optString("encoding", "utf8");
                        String a12 = a(optString8, iApiCallback);
                        if (a12 != null) {
                            if (!q.a(a12, this.j)) {
                                q.a(iApiCallback);
                                break;
                            } else {
                                File file6 = new File(a12);
                                if (!file6.exists()) {
                                    iApiCallback.onFail(a("no such file or directory, open \"%s\"", optString8));
                                    break;
                                } else if (!file6.exists() || !file6.isDirectory()) {
                                    g.a a13 = g.a(optString10);
                                    if (a13 == null) {
                                        iApiCallback.onFail(a("invalid encoding", new Object[0]));
                                        break;
                                    } else {
                                        try {
                                            byteBuffer = a13.a(optString9);
                                        } catch (Exception e) {
                                            b.a(e);
                                            byteBuffer = null;
                                        }
                                        if (byteBuffer == null || !byteBuffer.hasArray()) {
                                            iApiCallback.onFail();
                                            break;
                                        } else if (!a(byteBuffer.array().length, optString8)) {
                                            iApiCallback.onFail(a("the maximum size of the file storage limit is exceeded", new Object[0]));
                                            break;
                                        } else if (!x.a(file6, byteBuffer, true)) {
                                            iApiCallback.onFail(a("permission denied, open \"%s\"", optString8));
                                            break;
                                        } else {
                                            iApiCallback.onSuccess(null);
                                            break;
                                        }
                                    }
                                } else {
                                    iApiCallback.onFail(a("illegal operation on a directory, open \"%s\"", optString8));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect7, false, "e4b111bb4b88309aa1e1203d836a908f");
                    break;
                }
                break;
            case '\n':
            case 11:
                Object[] objArr9 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (!PatchProxy.isSupport(objArr9, this, changeQuickRedirect8, false, "4faa3f0327040ffd25999014f3ca3720", RobustBitConfig.DEFAULT_VALUE)) {
                    String optString11 = jSONObject.optString(TbsReaderView.KEY_FILE_PATH);
                    String optString12 = jSONObject.optString("data");
                    if (TextUtils.isEmpty(optString12)) {
                        iApiCallback.onSuccess(null);
                        break;
                    } else {
                        boolean optBoolean = jSONObject.optBoolean("append", false);
                        String optString13 = jSONObject.optString("encoding", "utf8");
                        String a14 = a(optString11, iApiCallback);
                        if (a14 != null) {
                            if (!q.a(a14, this.j)) {
                                q.a(iApiCallback);
                                break;
                            } else {
                                File file7 = new File(a14);
                                if (!file7.getParentFile().exists()) {
                                    iApiCallback.onFail(a("no such file or directory, open \"%s\"", optString11));
                                    break;
                                } else {
                                    g.a a15 = g.a(optString13);
                                    if (a15 == null) {
                                        iApiCallback.onFail(a("invalid encoding", new Object[0]));
                                        break;
                                    } else {
                                        try {
                                            byteBuffer2 = a15.a(optString12);
                                        } catch (Exception e2) {
                                            b.a(e2);
                                            byteBuffer2 = null;
                                        }
                                        if (byteBuffer2 == null || !byteBuffer2.hasArray()) {
                                            iApiCallback.onFail();
                                            break;
                                        } else if (!x.a(file7, byteBuffer2, optBoolean)) {
                                            iApiCallback.onFail(a("permission denied, open \"%s\"", optString11));
                                            break;
                                        } else {
                                            iApiCallback.onSuccess(null);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect8, false, "4faa3f0327040ffd25999014f3ca3720");
                    break;
                }
                break;
            case '\f':
            case '\r':
                Object[] objArr10 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (!PatchProxy.isSupport(objArr10, this, changeQuickRedirect9, false, "1c7c4706d0259402665b92b868b726b8", RobustBitConfig.DEFAULT_VALUE)) {
                    String optString14 = jSONObject.optString(TbsReaderView.KEY_FILE_PATH);
                    String optString15 = jSONObject.optString("encoding", "binary");
                    if ("".equals(optString15)) {
                        optString15 = "binary";
                    }
                    String a16 = a(optString14, iApiCallback);
                    if (a16 != null) {
                        if (!q.a(a16, getAppConfig().e(getContext()))) {
                            q.a(iApiCallback);
                            break;
                        } else {
                            File file8 = new File(a16);
                            if (!file8.exists()) {
                                iApiCallback.onFail(a("no such file %s", optString14));
                                break;
                            } else {
                                g.a a17 = g.a(optString15);
                                if (a17 == null) {
                                    iApiCallback.onFail(a("invalid encoding", new Object[0]));
                                    break;
                                } else {
                                    ByteBuffer a18 = x.a(file8);
                                    if (a18 != null) {
                                        String a19 = a17.a(a18);
                                        JSONObject jSONObject5 = new JSONObject();
                                        try {
                                            jSONObject5.put("data", a19);
                                        } catch (JSONException unused4) {
                                        }
                                        iApiCallback.onSuccess(jSONObject5);
                                        break;
                                    } else {
                                        iApiCallback.onFail(a("permission denied, open \"%s\"", optString14));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect9, false, "1c7c4706d0259402665b92b868b726b8");
                    break;
                }
                break;
            case 14:
            case 15:
                Object[] objArr11 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect10 = a;
                if (!PatchProxy.isSupport(objArr11, this, changeQuickRedirect10, false, "d6b31c4d5e762094575237453ed10b8f", RobustBitConfig.DEFAULT_VALUE)) {
                    String optString16 = jSONObject.optString("srcPath");
                    String optString17 = jSONObject.optString("destPath");
                    String a20 = a(optString16, iApiCallback);
                    if (a20 != null && (a2 = a(optString17, iApiCallback)) != null) {
                        if (!q.a(a20, getAppConfig().e(getContext())) || !q.a(a2, this.j)) {
                            q.a(iApiCallback);
                            break;
                        } else {
                            File file9 = new File(a20);
                            File file10 = new File(a2);
                            if (!file10.exists()) {
                                if (!file9.exists() || !file9.isFile() || !file10.getParentFile().exists() || !file10.getParentFile().isDirectory()) {
                                    iApiCallback.onFail(a("no such file or directory, copyFile \"%s\" -> \"%s\"", optString16, optString17));
                                    break;
                                } else if (!a((int) file9.length(), a20)) {
                                    iApiCallback.onFail(a("the maximum size of the file storage limit is exceeded", new Object[0]));
                                    break;
                                } else if (!s.a(file9.getAbsolutePath(), file10.getAbsolutePath())) {
                                    iApiCallback.onFail(a("permission denied, copyFile \"%s\" -> \"%s\"", optString16, optString17));
                                    break;
                                } else {
                                    iApiCallback.onSuccess(null);
                                    break;
                                }
                            } else {
                                iApiCallback.onFail(a("illegal operation on a directory, open \"%s\"", optString17));
                                break;
                            }
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect10, false, "d6b31c4d5e762094575237453ed10b8f");
                    break;
                }
                break;
            case 16:
            case 17:
                Object[] objArr12 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect11 = a;
                if (!PatchProxy.isSupport(objArr12, this, changeQuickRedirect11, false, "bb28446c13f28b82ef22628b99d64448", RobustBitConfig.DEFAULT_VALUE)) {
                    String optString18 = jSONObject.optString("dirPath");
                    boolean optBoolean2 = jSONObject.optBoolean("recursive");
                    String a21 = a(optString18, iApiCallback);
                    if (a21 != null) {
                        File file11 = new File(a21);
                        if (!q.a(a21, this.j)) {
                            q.a(iApiCallback);
                            break;
                        } else if (!file11.exists()) {
                            if (!optBoolean2 && !file11.getParentFile().exists()) {
                                iApiCallback.onFail(a("no such file or directory \"%s\"", optString18));
                                break;
                            } else {
                                try {
                                    if (optBoolean2) {
                                        mkdir = file11.mkdirs();
                                    } else if (!file11.getParentFile().exists()) {
                                        iApiCallback.onFail(a("no such file or directory \"%s\"", optString18));
                                        break;
                                    } else {
                                        mkdir = file11.mkdir();
                                    }
                                    if (mkdir) {
                                        iApiCallback.onSuccess(null);
                                        break;
                                    } else {
                                        iApiCallback.onFail();
                                        break;
                                    }
                                } catch (SecurityException unused5) {
                                    iApiCallback.onFail(a("permission denied, open \"%s\"", optString18));
                                    break;
                                }
                            }
                        } else {
                            iApiCallback.onFail(a("file already exists \"%s\"", optString18));
                            break;
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect11, false, "bb28446c13f28b82ef22628b99d64448");
                    break;
                }
                break;
            case 18:
            case 19:
                b(jSONObject, iApiCallback);
                break;
            case 20:
            case 21:
                Object[] objArr13 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect12 = a;
                if (!PatchProxy.isSupport(objArr13, this, changeQuickRedirect12, false, "c9440374c2ac726e7c8a40f0834e5235", RobustBitConfig.DEFAULT_VALUE)) {
                    String optString19 = jSONObject.optString("oldPath");
                    String optString20 = jSONObject.optString("newPath");
                    String a22 = a(optString19, iApiCallback);
                    if (a22 != null && (a3 = a(optString20, iApiCallback)) != null) {
                        getAppConfig().e(getContext());
                        if (!q.a(a22, this.j) || !q.a(a3, this.j)) {
                            q.a(iApiCallback);
                            break;
                        } else {
                            File file12 = new File(a22);
                            File file13 = new File(a3);
                            if (!file12.exists() || !file13.getParentFile().exists()) {
                                iApiCallback.onFail(a("no such file or directory, rename \"%s\" -> \"%s\"", optString19, optString20));
                                break;
                            } else if (!file12.renameTo(file13)) {
                                iApiCallback.onFail(a("permission denied, rename \"%s\" -> \"%s\"", optString19, optString20));
                                break;
                            } else {
                                iApiCallback.onSuccess(null);
                                break;
                            }
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect12, false, "c9440374c2ac726e7c8a40f0834e5235");
                    break;
                }
                break;
            case 22:
            case 23:
                Object[] objArr14 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect13 = a;
                if (!PatchProxy.isSupport(objArr14, this, changeQuickRedirect13, false, "5d4fe5526ee09d8e2f1591b98e6eda11", RobustBitConfig.DEFAULT_VALUE)) {
                    String optString21 = jSONObject.optString("dirPath");
                    boolean optBoolean3 = jSONObject.optBoolean("recursive");
                    String a23 = a(optString21, iApiCallback);
                    if (a23 != null) {
                        if (!q.a(a23, this.j)) {
                            q.a(iApiCallback);
                            break;
                        } else {
                            File file14 = new File(a23);
                            if (!file14.exists() || !file14.isDirectory()) {
                                iApiCallback.onFail(a("no such file or directory \"%s\"", optString21));
                                break;
                            } else if (!optBoolean3 && file14.list().length > 0) {
                                iApiCallback.onFail(a("directory not empty", new Object[0]));
                                break;
                            } else if (!s.a(file14.getAbsolutePath())) {
                                iApiCallback.onFail(a("permission denied, open \"%s\"", optString21));
                                break;
                            } else {
                                iApiCallback.onSuccess(null);
                                break;
                            }
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect13, false, "5d4fe5526ee09d8e2f1591b98e6eda11");
                    break;
                }
                break;
            case 24:
            case 25:
                Object[] objArr15 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect14 = a;
                if (!PatchProxy.isSupport(objArr15, this, changeQuickRedirect14, false, "9e2f74000888148aa3718f550c0ae4d3", RobustBitConfig.DEFAULT_VALUE)) {
                    String optString22 = jSONObject.optString(TbsReaderView.KEY_FILE_PATH);
                    String a24 = a(optString22, iApiCallback);
                    if (a24 != null) {
                        if (!q.a(a24, getAppConfig().e(getContext()))) {
                            q.a(iApiCallback);
                            break;
                        } else {
                            File file15 = new File(a24);
                            if (!file15.exists()) {
                                iApiCallback.onFail(a("no such file or directory \"%s\"", optString22));
                                break;
                            } else if (!file15.isDirectory()) {
                                if (!file15.delete()) {
                                    iApiCallback.onFail(a("permission denied, open \"%s\"", optString22));
                                    break;
                                } else {
                                    iApiCallback.onSuccess(null);
                                    break;
                                }
                            } else {
                                iApiCallback.onFail(a("operation not permitted, unlink \"%s\"", optString22));
                                break;
                            }
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect14, false, "9e2f74000888148aa3718f550c0ae4d3");
                    break;
                }
                break;
            case 26:
                Object[] objArr16 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect15 = a;
                if (!PatchProxy.isSupport(objArr16, this, changeQuickRedirect15, false, "cd5b9006cc28c465bfbd30af54d0c72c", RobustBitConfig.DEFAULT_VALUE)) {
                    String optString23 = jSONObject.optString("zipFilePath");
                    String optString24 = jSONObject.optString("targetPath");
                    String a25 = a(optString24, iApiCallback);
                    if (a25 != null) {
                        if (optString23.startsWith("wdfile://store_")) {
                            a4 = a(optString23);
                        } else {
                            a4 = a(optString23, iApiCallback);
                        }
                        if (a4 != null) {
                            if (!q.a(a25, this.j)) {
                                q.a(iApiCallback);
                                break;
                            } else {
                                File file16 = new File(a25);
                                File file17 = new File(a4);
                                if (!file17.exists() || !file17.isFile()) {
                                    iApiCallback.onFail(a("no such file %s", optString23));
                                    break;
                                } else if (!file16.getParentFile().exists() || !file16.getParentFile().isDirectory()) {
                                    iApiCallback.onFail(a("no such file or directory, open \"%s\"", optString24));
                                    break;
                                } else if (!a((int) r.b(a4), a4)) {
                                    iApiCallback.onFail(a("the maximum size of the file storage limit is exceeded", new Object[0]));
                                    break;
                                } else if (!bg.a(file17.getAbsolutePath(), file16.getAbsolutePath())) {
                                    iApiCallback.onFail(a("permission denied, open \"%s\"", optString24));
                                    break;
                                } else {
                                    iApiCallback.onSuccess(null);
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect15, false, "cd5b9006cc28c465bfbd30af54d0c72c");
                    break;
                }
                break;
            case 27:
            case 28:
                a(jSONObject, iApiCallback);
                break;
        }
        Object[] objArr17 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect16 = a;
        if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect16, false, "46e714d6bc725d795bdd40de9948b191", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect16, false, "46e714d6bc725d795bdd40de9948b191");
            return;
        }
        com.meituan.mmp.lib.devtools.g gVar = this.e;
        if (gVar == null || !gVar.a()) {
            return;
        }
        j();
    }

    private void a(JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1185b39cf1d6dbd6c9988583eb970aa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1185b39cf1d6dbd6c9988583eb970aa7");
            return;
        }
        String optString = jSONObject.optString("path");
        boolean optBoolean = jSONObject.optBoolean("recursive");
        String a2 = a(optString, iApiCallback);
        if (a2 == null) {
            return;
        }
        if (!q.a(a2, getAppConfig().e(getContext()))) {
            q.a(iApiCallback);
            return;
        }
        File file = new File(a2);
        if (!file.exists()) {
            iApiCallback.onFail(a("no such file or directory \"%s\"", optString));
        } else if (file.isFile() || (file.isDirectory() && !optBoolean)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                s.a f = s.f(file.getAbsolutePath());
                jSONObject3.put("lastAccessedTime", f.b);
                jSONObject3.put("lastModifiedTime", file.lastModified() / 1000);
                jSONObject3.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, file.length());
                jSONObject3.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, f.a);
                jSONObject2.put("stats", jSONObject3);
            } catch (JSONException unused) {
            }
            iApiCallback.onSuccess(jSONObject2);
        } else {
            String absolutePath = file.getAbsolutePath();
            int length = absolutePath.endsWith("/") ? absolutePath.length() : absolutePath.length() + 1;
            HashSet hashSet = new HashSet();
            s.a(file.getAbsolutePath(), hashSet, optBoolean, true);
            JSONObject jSONObject4 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            try {
                for (Iterator it = hashSet.iterator(); it.hasNext(); it = it) {
                    File file2 = (File) it.next();
                    JSONObject jSONObject5 = new JSONObject();
                    if (file2.getAbsolutePath().equals(absolutePath)) {
                        jSONObject5.put("path", "/");
                    } else {
                        jSONObject5.put("path", file2.getAbsolutePath().substring(length));
                    }
                    s.a f2 = s.f(file.getAbsolutePath());
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("lastAccessedTime", f2.b);
                    jSONObject6.put("lastModifiedTime", file2.lastModified() / 1000);
                    jSONObject6.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, file2.length());
                    jSONObject6.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, f2.a);
                    jSONObject5.put("stats", jSONObject6);
                    jSONArray.put(jSONObject5);
                }
                jSONObject4.put("stats", jSONArray);
            } catch (JSONException unused2) {
            }
            iApiCallback.onSuccess(jSONObject4);
        }
    }

    private void b(JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924eabb9e86b57b1b366988dd5dd7452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924eabb9e86b57b1b366988dd5dd7452");
            return;
        }
        String optString = jSONObject.optString("dirPath");
        String a2 = a(optString, iApiCallback);
        if (a2 == null) {
            return;
        }
        if (!q.a(a2, this.j)) {
            q.a(iApiCallback);
            return;
        }
        File file = new File(a2);
        if (file.isFile()) {
            iApiCallback.onFail(a("not a directory \"%s\"", optString));
        } else if (file.exists() && file.isDirectory()) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                String[] list = file.list();
                JSONArray jSONArray = new JSONArray();
                for (String str : list) {
                    jSONArray.put(str);
                }
                jSONObject2.put("files", jSONArray);
            } catch (SecurityException unused) {
                iApiCallback.onFail(a("permission denied, open \"%s\"", optString));
                return;
            } catch (JSONException unused2) {
            }
            iApiCallback.onSuccess(jSONObject2);
        } else {
            iApiCallback.onFail(a("no such file or directory \"%s\"", optString));
        }
    }

    private JSONObject a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "487135dc19f033aabfaa1377eea11a6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "487135dc19f033aabfaa1377eea11a6e");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", String.format(str, objArr));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Nullable
    private String a(String str, IApiCallback iApiCallback) {
        String d;
        Object[] objArr = {str, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "911c42be4b929e6330e2f5a6eaab5b7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "911c42be4b929e6330e2f5a6eaab5b7b");
        }
        if (TextUtils.isEmpty(str)) {
            iApiCallback.onFail(a("permission denied, open \"%s\"", str));
            return null;
        } else if (str.equals("wdfile://usr") || str.equals("wdfile://usr/")) {
            return d(this.j);
        } else {
            if (str.startsWith("wdfile://")) {
                str = str.substring(7);
            }
            String substring = str.substring(str.indexOf("//") + 2);
            if (substring.startsWith("usr/")) {
                substring = substring.substring(3);
                d = d(this.j);
            } else if (substring.startsWith("store_")) {
                d = d(this.i);
            } else if (!substring.startsWith("tmp_")) {
                iApiCallback.onFail(a("permission denied, open \"%s\"", str));
                return null;
            } else {
                d = d(this.h);
            }
            return d + File.separator + substring;
        }
    }

    @Nullable
    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48519e827b44aef9e16d7bf5c37e8e00", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48519e827b44aef9e16d7bf5c37e8e00");
        }
        if (str.startsWith("wdfile://store_")) {
            String substring = str.substring(str.indexOf("//") + 2);
            String d = d(this.i);
            return d + File.separator + substring;
        }
        return null;
    }

    private void a(IApiCallback iApiCallback) {
        JSONObject jSONObject;
        String str;
        char c = 1;
        Object[] objArr = {iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2db36e1ffb0690a7552fbc54a6ecedb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2db36e1ffb0690a7552fbc54a6ecedb8");
            return;
        }
        File file = new File(d(this.i));
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (file.listFiles() != null) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, file2.length());
                    jSONObject3.put("createTime", file2.lastModified() / 1000);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = file2;
                    objArr2[c] = DefaultHeaderService.KEY_STORE;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    try {
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "645979ed566556160cc922cdb61acc02", RobustBitConfig.DEFAULT_VALUE)) {
                            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "645979ed566556160cc922cdb61acc02");
                        } else if ("usr".equals(DefaultHeaderService.KEY_STORE)) {
                            str = "wdfile://" + DefaultHeaderService.KEY_STORE + File.separator + file2.getAbsolutePath().substring(this.j.length());
                        } else {
                            str = "wdfile://" + file2.getName();
                        }
                        String str2 = str;
                        jSONObject = jSONObject3;
                        try {
                            jSONObject.put(TbsReaderView.KEY_FILE_PATH, str2);
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                        jSONObject = jSONObject3;
                    }
                } catch (JSONException unused3) {
                    jSONObject = jSONObject3;
                }
                jSONArray.put(jSONObject);
                i++;
                c = 1;
            }
        }
        try {
            jSONObject2.put("fileList", jSONArray);
            iApiCallback.onSuccess(jSONObject2);
        } catch (JSONException unused4) {
            b.d("InnerApi", "getSavedFileList assemble result exception!");
            iApiCallback.onFail();
        }
    }

    private String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d05979d6c5191f547d8b679f40dd0941", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d05979d6c5191f547d8b679f40dd0941");
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private boolean a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20335948d01941d7d8d66f6a85e53883", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20335948d01941d7d8d66f6a85e53883")).booleanValue() : ((double) (j() + ((long) i))) <= 1.048576E7d;
    }

    private long j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04ba8959660eeaa47fe88dea3b1aec9a", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04ba8959660eeaa47fe88dea3b1aec9a")).longValue() : (long) (r.a(this.j, 1) + r.a(this.i, 1));
    }
}
