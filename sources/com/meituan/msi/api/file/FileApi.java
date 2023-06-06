package com.meituan.msi.api.file;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.msc.modules.api.msi.navigation.MiniProgramApi;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.file.GetSavedFileListResponse;
import com.meituan.msi.api.file.ReadZipEntryParam;
import com.meituan.msi.api.file.ReadZipEntryResponse;
import com.meituan.msi.api.file.StatsData;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.util.file.a;
import com.meituan.msi.util.file.b;
import com.meituan.msi.util.file.c;
import com.meituan.msi.util.file.d;
import com.meituan.msi.util.file.f;
import com.meituan.msi.util.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.tencent.smtt.sdk.TbsReaderView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FileApi implements IMsiApi {
    public static ChangeQuickRedirect a;
    private static final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();
    private static final AtomicInteger c = new AtomicInteger(0);

    @MsiApiMethod(name = "getFileSystemManager")
    public void getFileSystemManager() {
    }

    @MsiApiMethod(name = "FileSystemManager.readCompressedFileSync", request = ReadCompressedFileParam.class, response = ReadCompressedFileResponse.class)
    public void readCompressedFileSync(ReadCompressedFileParam readCompressedFileParam, MsiContext msiContext) {
    }

    @MsiApiMethod(name = "saveFileToDisk")
    public void saveFileToDisk() {
    }

    @MsiApiMethod(name = "saveFile", request = SaveFileParam.class, response = SaveFileResponse.class)
    public void wxSaveFile(SaveFileParam saveFileParam, MsiContext msiContext) {
        Object[] objArr = {saveFileParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb2e1185dc4c6e63c617010883414374", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb2e1185dc4c6e63c617010883414374");
            return;
        }
        FSMSaveFileParam fSMSaveFileParam = new FSMSaveFileParam();
        fSMSaveFileParam.tempFilePath = saveFileParam.tempFilePath;
        saveFileSync(fSMSaveFileParam, msiContext);
    }

    @MsiApiMethod(name = "removeSavedFile", request = RemoveSavedFileParam.class)
    public void removeSavedFile(RemoveSavedFileParam removeSavedFileParam, MsiContext msiContext) {
        Object[] objArr = {removeSavedFileParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0754ca4662161cffc2e400087f1ec04f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0754ca4662161cffc2e400087f1ec04f");
        } else if (d(removeSavedFileParam.filePath, msiContext)) {
            if (!b(removeSavedFileParam.filePath, msiContext)) {
                msiContext.onError(401, String.format("permission denied, remove \"%s\"", removeSavedFileParam.filePath));
            } else if (e(removeSavedFileParam.filePath, msiContext)) {
                File file = new File(msiContext.getFileProvider().a(removeSavedFileParam.filePath));
                if (!file.exists()) {
                    msiContext.onError(String.format("%s file not exist", removeSavedFileParam.filePath));
                } else if (file.delete()) {
                    msiContext.onSuccess(null);
                } else {
                    msiContext.onError(String.format("permission denied, remove \"%s\"", removeSavedFileParam.filePath));
                }
            }
        }
    }

    @MsiApiMethod(name = "openDocument", request = OpenDocumentParam.class)
    public void openDocument(OpenDocumentParam openDocumentParam, MsiContext msiContext) {
        Object[] objArr = {openDocumentParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69e7256976980a561673ed38369ea3ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69e7256976980a561673ed38369ea3ff");
        } else if (d(openDocumentParam.filePath, msiContext) && e(openDocumentParam.filePath, msiContext)) {
            String a2 = msiContext.getFileProvider().a(openDocumentParam.filePath);
            String str = openDocumentParam.fileType;
            boolean z = openDocumentParam.showMenu;
            if (!b.a(a2, d.a(msiContext)) && !b.a(a2, msiContext.getFileProvider().b()) && !b.a(a2, msiContext.getFileProvider().c())) {
                msiContext.onError(401, String.format("fail permission denied, open %s", a2));
                return;
            }
            Intent intent = new Intent("com.meituan.mmp.action.DocumentPreviewActivity");
            intent.setPackage(msiContext.getActivity().getPackageName());
            intent.putExtra(TbsReaderView.KEY_FILE_PATH, a2);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("fileType", str);
            }
            intent.putExtra("showMenu", z);
            msiContext.getActivity().startActivity(intent);
            msiContext.onSuccess("");
        }
    }

    @MsiApiMethod(name = "getSavedFileList", response = GetSavedFileListResponse.class)
    public void getSavedFileList(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12ca14aabd3b9a22478c16443f742bfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12ca14aabd3b9a22478c16443f742bfe");
            return;
        }
        File file = new File(d.a(msiContext));
        GetSavedFileListResponse getSavedFileListResponse = new GetSavedFileListResponse();
        getSavedFileListResponse.fileList = new ArrayList<>();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                GetSavedFileListResponse.FileItem fileItem = new GetSavedFileListResponse.FileItem();
                fileItem.filePath = a(file2.getName(), msiContext);
                fileItem.size = a(file2, msiContext);
                fileItem.createTime = c(file2.getName(), msiContext);
                getSavedFileListResponse.fileList.add(fileItem);
            }
        }
        msiContext.onSuccess(getSavedFileListResponse);
    }

    @MsiApiMethod(name = "getSavedFileInfo", request = GetSavedFileInfoParam.class, response = GetSavedFileInfoResponse.class)
    public void getSavedFileInfo(GetSavedFileInfoParam getSavedFileInfoParam, MsiContext msiContext) {
        Object[] objArr = {getSavedFileInfoParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e7b19d0d5a787ffc196b8303d5b90e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e7b19d0d5a787ffc196b8303d5b90e3");
        } else if (d(getSavedFileInfoParam.filePath, msiContext)) {
            if (!b(getSavedFileInfoParam.filePath, msiContext)) {
                msiContext.onError(401, "file path is null");
            } else if (e(getSavedFileInfoParam.filePath, msiContext)) {
                File file = new File(msiContext.getFileProvider().a(getSavedFileInfoParam.filePath));
                GetSavedFileInfoResponse getSavedFileInfoResponse = new GetSavedFileInfoResponse();
                getSavedFileInfoResponse.createTime = c(file.getName(), msiContext);
                getSavedFileInfoResponse.size = a(file, msiContext);
                msiContext.onSuccess(getSavedFileInfoResponse);
            }
        }
    }

    @MsiApiMethod(name = "getFileInfo", request = GetFileInfoParam.class, response = GetFileInfoResponse.class)
    public void getFileInfo(GetFileInfoParam getFileInfoParam, MsiContext msiContext) {
        Object[] objArr = {getFileInfoParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "597faa847645d7462bd23bb133bbbd74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "597faa847645d7462bd23bb133bbbd74");
        } else if (d(getFileInfoParam.filePath, msiContext) && e(getFileInfoParam.filePath, msiContext)) {
            String a2 = msiContext.getFileProvider().a(getFileInfoParam.filePath);
            File file = new File(a2);
            String str = "";
            GetFileInfoResponse getFileInfoResponse = new GetFileInfoResponse();
            if ("MD5".equalsIgnoreCase(getFileInfoParam.digestAlgorithm) || TextUtils.isEmpty(getFileInfoParam.digestAlgorithm)) {
                str = d.c(file);
            } else if ("sha1".equalsIgnoreCase(getFileInfoParam.digestAlgorithm)) {
                str = d.c(a2);
            }
            getFileInfoResponse.digest = str;
            getFileInfoResponse.size = a(file, msiContext);
            msiContext.onSuccess(getFileInfoResponse);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.access", request = AccessParam.class)
    public void access(AccessParam accessParam, MsiContext msiContext) {
        Object[] objArr = {accessParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dd48a53f3ac2c3a8c958b8b72ed482d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dd48a53f3ac2c3a8c958b8b72ed482d");
        } else {
            accessSync(accessParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.accessSync", request = AccessParam.class)
    public EmptyResponse accessSync(AccessParam accessParam, MsiContext msiContext) {
        Object[] objArr = {accessParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ba915eab23127872d4db3cc9014bb67", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ba915eab23127872d4db3cc9014bb67");
        }
        if (!d(accessParam.path, msiContext) || !e(accessParam.path, msiContext) || f(accessParam.path, msiContext)) {
            return EmptyResponse.INSTANCE;
        }
        msiContext.onSuccess(null);
        return EmptyResponse.INSTANCE;
    }

    @MsiApiMethod(name = "FileSystemManager.appendFile", request = AppendParam.class)
    public void appendFile(AppendParam appendParam, MsiContext msiContext) {
        Object[] objArr = {appendParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4258d173afa6d53c0c9b16595f7a305", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4258d173afa6d53c0c9b16595f7a305");
        } else {
            appendFileSync(appendParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.appendFileSync", request = AppendParam.class)
    public EmptyResponse appendFileSync(AppendParam appendParam, MsiContext msiContext) {
        Object[] objArr = {appendParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baef272a3c68e7ddc52d58659071bcba", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baef272a3c68e7ddc52d58659071bcba");
        }
        String str = appendParam.filePath;
        String str2 = appendParam.data;
        if (TextUtils.isEmpty(str2)) {
            msiContext.onSuccess(null);
            return EmptyResponse.INSTANCE;
        }
        String str3 = appendParam.encoding;
        if (TextUtils.isEmpty(str3)) {
            str3 = "utf8";
        }
        String a2 = msiContext.getFileProvider().a(str);
        if (!d(a2, msiContext) || a(str, msiContext.getFileProvider().c(), msiContext) || !e(str, msiContext)) {
            return EmptyResponse.INSTANCE;
        }
        File file = new File(a2);
        if (!file.isFile()) {
            msiContext.onError(400, String.format("%s  is not a file", str));
            return EmptyResponse.INSTANCE;
        }
        a.InterfaceC0499a a3 = a.a(str3);
        if (a3 == null) {
            msiContext.onError(400, "invalid encoding");
            return EmptyResponse.INSTANCE;
        }
        try {
            ByteBuffer a4 = a3.a(str2);
            if (a4 == null || !a4.hasArray()) {
                msiContext.onError(500, RaptorConstants.ERROR_UNKNOWN_VALUE);
                return EmptyResponse.INSTANCE;
            } else if (!a(a4.array().length, msiContext)) {
                msiContext.onError(400, "fail the maximum size of the file storage limit is exceeded");
                return EmptyResponse.INSTANCE;
            } else if (!h.a(file, a4, true)) {
                msiContext.onError(401, String.format("permission denied, open \"%s\"", str));
                return EmptyResponse.INSTANCE;
            } else {
                msiContext.onSuccess(null);
                return EmptyResponse.INSTANCE;
            }
        } catch (Exception unused) {
            msiContext.onError(500, RaptorConstants.ERROR_UNKNOWN_VALUE);
            return EmptyResponse.INSTANCE;
        }
    }

    @MsiApiMethod(name = "FileSystemManager.close", request = CloseParam.class)
    public void close(CloseParam closeParam, MsiContext msiContext) {
        Object[] objArr = {closeParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa12489bd50c9514a17bf22f4c73895b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa12489bd50c9514a17bf22f4c73895b");
        } else {
            closeSync(closeParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.closeSync", request = CloseParam.class)
    public EmptyResponse closeSync(CloseParam closeParam, MsiContext msiContext) {
        Object[] objArr = {closeParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a29c6778fbe896c575308a2c2d5c45c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a29c6778fbe896c575308a2c2d5c45c3");
        }
        String str = closeParam.fd;
        if (TextUtils.isEmpty(str)) {
            msiContext.onError(400, "bad file descriptor");
            return EmptyResponse.INSTANCE;
        }
        String str2 = b.get(str);
        String a2 = msiContext.getFileProvider().a(str2);
        if (str2 == null) {
            msiContext.onError(400, "bad file descriptor");
            return EmptyResponse.INSTANCE;
        } else if (a(str2, msiContext.getFileProvider().c(), msiContext)) {
            b.remove(str);
            return EmptyResponse.INSTANCE;
        } else {
            File file = new File(a2);
            if (!file.exists()) {
                b.remove(str);
                msiContext.onError(400, String.format("%s file not exist", str2));
                return EmptyResponse.INSTANCE;
            } else if (!file.isFile()) {
                b.remove(str);
                msiContext.onError(400, String.format("%s  is not a file", str2));
                return EmptyResponse.INSTANCE;
            } else {
                b.remove(str);
                msiContext.onSuccess(null);
                return EmptyResponse.INSTANCE;
            }
        }
    }

    @MsiApiMethod(name = "FileSystemManager.copyFile", request = CopyParam.class)
    public void copyFile(CopyParam copyParam, MsiContext msiContext) {
        Object[] objArr = {copyParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34bfacf6490b563127617c06a4443733", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34bfacf6490b563127617c06a4443733");
        } else {
            copyFileSync(copyParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.copyFileSync", request = CopyParam.class)
    public EmptyResponse copyFileSync(CopyParam copyParam, MsiContext msiContext) {
        String str;
        boolean z;
        boolean z2;
        Object[] objArr = {copyParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a1463f41aabe87c4fb3a5839606ad40", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a1463f41aabe87c4fb3a5839606ad40");
        }
        String str2 = copyParam.srcPath;
        String str3 = copyParam.destPath;
        if (!d(str2, msiContext) || !d(str3, msiContext) || f(str2, msiContext) || a(str3, msiContext.getFileProvider().c(), msiContext)) {
            return EmptyResponse.INSTANCE;
        }
        String a2 = msiContext.getFileProvider().a(str2);
        String a3 = msiContext.getFileProvider().a(str3);
        File file = new File(a3);
        File file2 = new File(a3);
        if (e(str3, msiContext)) {
            msiContext.onError(String.format("illegal operation on a directory, open %s", str3));
            return EmptyResponse.INSTANCE;
        }
        if (b(file)) {
            Object[] objArr2 = {file};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "520d60a126c9bda6530f8a68ba289439", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "520d60a126c9bda6530f8a68ba289439")).booleanValue();
            } else {
                z = file.isFile();
            }
            if (z && b(file2)) {
                Object[] objArr3 = {file2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                str = str3;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b5afe0fa0bd4a711e2339ec849c894f3", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b5afe0fa0bd4a711e2339ec849c894f3")).booleanValue();
                } else {
                    z2 = file2.isDirectory();
                }
                if (z2) {
                    if (!a((int) file.length(), msiContext)) {
                        msiContext.onError(400, "fail the maximum size of the file storage limit is exceeded");
                        return EmptyResponse.INSTANCE;
                    }
                    if (d.a(a2, a3, (String) null)) {
                        msiContext.onSuccess(null);
                    } else {
                        msiContext.onError(400, String.format("permission denied, copyFile \"%s\" -> \"%s\"", str2, str));
                    }
                    return EmptyResponse.INSTANCE;
                }
                msiContext.onError(String.format("no such file or directory, copyFile %s -> %s", str2, str));
                return EmptyResponse.INSTANCE;
            }
        }
        str = str3;
        msiContext.onError(String.format("no such file or directory, copyFile %s -> %s", str2, str));
        return EmptyResponse.INSTANCE;
    }

    @MsiApiMethod(name = "FileSystemManager.fstat", request = FStatParam.class, response = FStatResponse.class)
    public void fstat(FStatParam fStatParam, MsiContext msiContext) {
        Object[] objArr = {fStatParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3addc6cb50082c112505d58b28f01d89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3addc6cb50082c112505d58b28f01d89");
        } else {
            fstatSync(fStatParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.fstatSync", request = FStatParam.class, response = FStatResponse.class)
    public FStatResponse fstatSync(FStatParam fStatParam, MsiContext msiContext) {
        Object[] objArr = {fStatParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a77fab1466c57fd09ed12663b853bd6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (FStatResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a77fab1466c57fd09ed12663b853bd6e");
        }
        String str = fStatParam.fd;
        if (TextUtils.isEmpty(str)) {
            msiContext.onError(400, "bad file descriptor");
            return new FStatResponse();
        }
        String str2 = b.get(str);
        if (!d(str2, msiContext)) {
            return new FStatResponse();
        }
        StatsData.Stats a2 = a(new File(msiContext.getFileProvider().a(str2)));
        FStatResponse fStatResponse = new FStatResponse();
        fStatResponse.stats = a2;
        msiContext.onSuccess(fStatResponse);
        return fStatResponse;
    }

    @MsiApiMethod(name = "FileSystemManager.ftruncate", request = FTruncateParam.class)
    public void ftruncate(FTruncateParam fTruncateParam, MsiContext msiContext) {
        Object[] objArr = {fTruncateParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "249bc98506e1416eb7540fee7431d659", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "249bc98506e1416eb7540fee7431d659");
        } else {
            ftruncateSync(fTruncateParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.ftruncateSync", request = FTruncateParam.class)
    public EmptyResponse ftruncateSync(FTruncateParam fTruncateParam, MsiContext msiContext) {
        Object[] objArr = {fTruncateParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ab3984fac0f4954f35ab52d1c4c5603", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ab3984fac0f4954f35ab52d1c4c5603");
        }
        String str = fTruncateParam.fd;
        a(b.get(str), a(str), fTruncateParam.length, msiContext);
        return EmptyResponse.INSTANCE;
    }

    @MsiApiMethod(name = "FileSystemManager.getFileInfo", request = FSMGetFileInfoParam.class, response = FSMGetFileInfoResponse.class)
    public void getFileInfo(FSMGetFileInfoParam fSMGetFileInfoParam, MsiContext msiContext) {
        Object[] objArr = {fSMGetFileInfoParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64936c9bcb8d9d0ef7e47a209b1c8d6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64936c9bcb8d9d0ef7e47a209b1c8d6f");
            return;
        }
        String str = fSMGetFileInfoParam.filePath;
        if (d(str, msiContext) && e(str, msiContext) && !f(str, msiContext)) {
            File file = new File(msiContext.getFileProvider().a(str));
            FSMGetFileInfoResponse fSMGetFileInfoResponse = new FSMGetFileInfoResponse();
            fSMGetFileInfoResponse.size = file.length();
            msiContext.onSuccess(fSMGetFileInfoResponse);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.getSavedFileList", response = GetSavedFileListResponse.class)
    public void FSMGetSavedFileList(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e478ff04c9248a5a9f3ea4192a0a9aeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e478ff04c9248a5a9f3ea4192a0a9aeb");
        } else {
            getSavedFileList(msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.mkdir", request = DirParam.class)
    public void mkdir(DirParam dirParam, MsiContext msiContext) {
        Object[] objArr = {dirParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a26eacf758e180f9afb51673c1df2f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a26eacf758e180f9afb51673c1df2f8");
        } else {
            mkdirSync(dirParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.mkdirSync", request = DirParam.class)
    public EmptyResponse mkdirSync(DirParam dirParam, MsiContext msiContext) {
        Object[] objArr = {dirParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "997266c3e84154a99d07a137de34b119", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "997266c3e84154a99d07a137de34b119");
        }
        String str = dirParam.dirPath;
        boolean z = dirParam.recursive;
        if (!d(str, msiContext) || a(str, msiContext.getFileProvider().c(), msiContext)) {
            return EmptyResponse.INSTANCE;
        }
        File file = new File(msiContext.getFileProvider().a(str));
        if (file.exists()) {
            msiContext.onError(500, String.format("file already exists %s", str));
            return EmptyResponse.INSTANCE;
        } else if (!z && (file.getParentFile() == null || !file.getParentFile().exists())) {
            msiContext.onError(400, String.format("fail not a directory %s", str));
            return EmptyResponse.INSTANCE;
        } else {
            try {
                if (file.mkdirs()) {
                    msiContext.onSuccess(null);
                } else {
                    msiContext.onError(401, String.format("permission denied, open \"%s\"", str));
                }
                return EmptyResponse.INSTANCE;
            } catch (SecurityException unused) {
                msiContext.onError(401, String.format("permission denied, open \"%s\"", str));
                return EmptyResponse.INSTANCE;
            }
        }
    }

    @MsiApiMethod(name = "FileSystemManager.open", request = OpenParam.class, response = OpenResponse.class)
    public void open(OpenParam openParam, MsiContext msiContext) {
        Object[] objArr = {openParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34613d0234f47b550405468eafe1667a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34613d0234f47b550405468eafe1667a");
        } else {
            openSync(openParam, msiContext);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0125, code lost:
        if (r14.equals("w") != false) goto L54;
     */
    @com.meituan.msi.annotations.MsiApiMethod(name = "FileSystemManager.openSync", request = com.meituan.msi.api.file.OpenParam.class, response = com.meituan.msi.api.file.OpenResponse.class)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.meituan.msi.api.file.OpenResponse openSync(com.meituan.msi.api.file.OpenParam r14, com.meituan.msi.bean.MsiContext r15) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.file.FileApi.openSync(com.meituan.msi.api.file.OpenParam, com.meituan.msi.bean.MsiContext):com.meituan.msi.api.file.OpenResponse");
    }

    @MsiApiMethod(name = "FileSystemManager.read", request = ReadParam.class, response = ReadResponse.class)
    public void read(ReadParam readParam, MsiContext msiContext) {
        Object[] objArr = {readParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eb4f3209197eb335a4b1a6f972d4302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eb4f3209197eb335a4b1a6f972d4302");
        } else {
            readSync(readParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.readSync", request = ReadParam.class, response = ReadResponse.class)
    public ReadResponse readSync(ReadParam readParam, MsiContext msiContext) {
        Throwable th;
        FileInputStream fileInputStream;
        Object[] objArr = {readParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd5d4622535f84f0d6bbe3d9f959083c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd5d4622535f84f0d6bbe3d9f959083c");
        }
        String str = readParam.fd;
        byte[] bArr = readParam.arrayBuffer;
        int i = readParam.length;
        int i2 = readParam.position;
        int i3 = readParam.offset;
        String str2 = b.get(str);
        String a2 = a(str);
        if (d(str2, msiContext) && e(str2, msiContext)) {
            if (TextUtils.isEmpty(a2) || "a".equals(a2) || "ax".equals(a2) || "as".equals(a2) || "w".equals(a2) || MiniProgramApi.NavigateMiniProgramParams.TARGET_MP_PLATFORM_WX.equals(a2)) {
                msiContext.onError(401, String.format("permission denied, open \"%s\"", str2));
                return new ReadResponse();
            }
            File file = new File(msiContext.getFileProvider().a(str2));
            if (i3 < 0 || i3 >= bArr.length) {
                msiContext.onError(400, "fail the value of \"offset\" is out of range");
                return new ReadResponse();
            } else if (i < 0) {
                msiContext.onError(400, "fail the value of \"length\" is out of range");
                return new ReadResponse();
            } else {
                ByteBuffer wrap = ByteBuffer.wrap(Base64.decode(bArr, 0));
                FileInputStream fileInputStream2 = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(file);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (FileNotFoundException unused) {
                } catch (IOException unused2) {
                }
                try {
                    long j = i2;
                    byte[] bArr2 = ((long) i) < file.length() - j ? new byte[i] : new byte[((int) file.length()) - i2];
                    fileInputStream.skip(j);
                    int read = fileInputStream.read(bArr2);
                    if (read != -1) {
                        wrap.put(bArr2, 0, read);
                    }
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    ReadResponse readResponse = new ReadResponse();
                    readResponse.arrayBuffer = Base64.encode(wrap.array(), 0);
                    readResponse.bytesRead = read;
                    msiContext.onSuccess(readResponse);
                    return readResponse;
                } catch (FileNotFoundException unused3) {
                    fileInputStream2 = fileInputStream;
                    msiContext.onError(400, String.format("%s file not exist", str2));
                    ReadResponse readResponse2 = new ReadResponse();
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    return readResponse2;
                } catch (IOException unused4) {
                    fileInputStream2 = fileInputStream;
                    msiContext.onError(401, String.format("permission denied, open \"%s\"", str2));
                    ReadResponse readResponse3 = new ReadResponse();
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return readResponse3;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
        }
        return new ReadResponse();
    }

    @MsiApiMethod(name = "FileSystemManager.readCompressedFile", request = ReadCompressedFileParam.class, response = ReadCompressedFileResponse.class)
    public void readCompressedFile(ReadCompressedFileParam readCompressedFileParam, MsiContext msiContext) {
        Object[] objArr = {readCompressedFileParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbf32a40182515064486b2e286e3f42f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbf32a40182515064486b2e286e3f42f");
        } else {
            readCompressedFileSync(readCompressedFileParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.readdir", request = ReaddirParam.class, response = ReaddirResponse.class)
    public void readdir(ReaddirParam readdirParam, MsiContext msiContext) {
        Object[] objArr = {readdirParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e666987f6e33b09537076ac40751a7fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e666987f6e33b09537076ac40751a7fb");
        } else {
            readdirSync(readdirParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.readdirSync", request = ReaddirParam.class, response = ReaddirResponse.class)
    public ReaddirResponse readdirSync(ReaddirParam readdirParam, MsiContext msiContext) {
        Object[] objArr = {readdirParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79b26effa92fcfbcb752860da1d476c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReaddirResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79b26effa92fcfbcb752860da1d476c7");
        }
        String str = readdirParam.dirPath;
        if (!d(str, msiContext) || a(str, msiContext.getFileProvider().c(), msiContext) || !e(str, msiContext)) {
            return new ReaddirResponse();
        }
        File file = new File(msiContext.getFileProvider().a(str));
        if (!file.isDirectory()) {
            msiContext.onError(400, String.format("fail not a directory %s", str));
            return new ReaddirResponse();
        }
        ReaddirResponse readdirResponse = new ReaddirResponse();
        try {
            readdirResponse.files = file.list();
            msiContext.onSuccess(readdirResponse);
            return readdirResponse;
        } catch (SecurityException unused) {
            msiContext.onError(401, String.format("permission denied, open \"%s\"", str));
            return readdirResponse;
        }
    }

    @MsiApiMethod(name = "FileSystemManager.readFile", request = ReadFileParam.class, response = ReadFileResponse.class)
    public void readFile(ReadFileParam readFileParam, MsiContext msiContext) {
        Object[] objArr = {readFileParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717d2832fec0737454eebc4a86b4c7d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717d2832fec0737454eebc4a86b4c7d0");
        } else {
            readFileSync(readFileParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.readFileSync", request = ReadFileParam.class, response = ReadFileResponse.class)
    public ReadFileResponse readFileSync(ReadFileParam readFileParam, MsiContext msiContext) {
        Object[] objArr = {readFileParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6278d6fea0a002ca5f0ec26be5c59c59", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadFileResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6278d6fea0a002ca5f0ec26be5c59c59");
        }
        String str = readFileParam.filePath;
        if (!d(str, msiContext) || f(str, msiContext) || !e(str, msiContext)) {
            return new ReadFileResponse();
        }
        String str2 = readFileParam.encoding;
        int i = readFileParam.position;
        int i2 = readFileParam.length;
        if (TextUtils.isEmpty(str2)) {
            str2 = "binary";
        }
        File file = new File(msiContext.getFileProvider().a(str));
        a.InterfaceC0499a a2 = a.a(str2);
        if (a2 == null) {
            msiContext.onError(400, "invalid encoding");
            return new ReadFileResponse();
        }
        try {
            ByteBuffer a3 = h.a(file, i, i2);
            if (a3 == null) {
                msiContext.onError(401, String.format("permission denied, open \"%s\"", str));
                return new ReadFileResponse();
            }
            ReadFileResponse readFileResponse = new ReadFileResponse();
            readFileResponse.data = a2.a(a3);
            msiContext.onSuccess(readFileResponse);
            return readFileResponse;
        } catch (ApiException unused) {
            msiContext.onError(500, RaptorConstants.ERROR_UNKNOWN_VALUE);
            return new ReadFileResponse();
        }
    }

    @MsiApiMethod(name = "FileSystemManager.readZipEntry", request = ReadZipEntryParam.class, response = ReadZipEntryResponse.class)
    public void readZipEntry(ReadZipEntryParam readZipEntryParam, MsiContext msiContext) {
        ReadZipEntryParam.Entry[] entryArr;
        Object[] objArr = {readZipEntryParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f531fa210a2dfeb6f730ee99e9fc68e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f531fa210a2dfeb6f730ee99e9fc68e");
            return;
        }
        String str = readZipEntryParam.filePath;
        String str2 = readZipEntryParam.encoding;
        Object obj = readZipEntryParam.entries;
        if (d(str, msiContext) && e(str, msiContext) && !f(str, msiContext)) {
            try {
                ZipFile zipFile = new ZipFile(new File(msiContext.getFileProvider().a(str)));
                HashMap<String, ReadZipEntryResponse.FileItem> hashMap = new HashMap<>();
                if (obj instanceof String) {
                    if (!"all".equals(obj)) {
                        msiContext.onError(400, RaptorConstants.ERROR_UNKNOWN_VALUE);
                        return;
                    }
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        hashMap.put(nextElement.getName(), a(zipFile, nextElement, str2, 0, 0));
                    }
                } else if (obj instanceof ReadZipEntryParam.Entry[]) {
                    for (ReadZipEntryParam.Entry entry : (ReadZipEntryParam.Entry[]) obj) {
                        ZipEntry entry2 = zipFile.getEntry(entry.path);
                        ReadZipEntryResponse.FileItem a2 = a(zipFile, entry2, entry.encoding, entry.position, entry.length);
                        if (entry2 == null) {
                            a2.errMsg = String.format("fail no such file or directory %s", entry.path);
                        }
                        hashMap.put(entry.path, a2);
                    }
                }
                ReadZipEntryResponse readZipEntryResponse = new ReadZipEntryResponse();
                readZipEntryResponse.entries = hashMap;
                msiContext.onSuccess(readZipEntryResponse);
            } catch (IOException unused) {
                msiContext.onError(401, String.format("permission denied, open \"%s\"", str));
            }
        }
    }

    @MsiApiMethod(name = "FileSystemManager.removeSavedFile", request = RemoveSavedFileParam.class)
    public void FSMRemoveSavedFile(RemoveSavedFileParam removeSavedFileParam, MsiContext msiContext) {
        Object[] objArr = {removeSavedFileParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e62f3a2d429465b01381ff84cd822bfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e62f3a2d429465b01381ff84cd822bfb");
        } else {
            removeSavedFile(removeSavedFileParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.rename", request = RenameParam.class)
    public void rename(RenameParam renameParam, MsiContext msiContext) {
        Object[] objArr = {renameParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "055022258752af0dd47bef28904b1b44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "055022258752af0dd47bef28904b1b44");
        } else {
            renameSync(renameParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.renameSync", request = RenameParam.class)
    public EmptyResponse renameSync(RenameParam renameParam, MsiContext msiContext) {
        Object[] objArr = {renameParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9f1e2fde602e64257be70fe645ab6b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9f1e2fde602e64257be70fe645ab6b4");
        }
        String str = renameParam.oldPath;
        String str2 = renameParam.newPath;
        String c2 = msiContext.getFileProvider().c();
        if (!d(str, msiContext) || !d(str2, msiContext) || a(str, c2, msiContext) || a(str2, c2, msiContext)) {
            return EmptyResponse.INSTANCE;
        }
        String a2 = msiContext.getFileProvider().a(str);
        String a3 = msiContext.getFileProvider().a(str2);
        File file = new File(a2);
        File file2 = new File(a3);
        if (!b(file) || b(file2)) {
            msiContext.onError(400, String.format("no such file or directory, rename \"%s\" -> \"%s\"", str, str2));
            return EmptyResponse.INSTANCE;
        } else if (!file.renameTo(file2)) {
            msiContext.onError(401, String.format("permission denied, rename \"%s\" -> \"%s\"", str, str2));
            return EmptyResponse.INSTANCE;
        } else {
            msiContext.onSuccess(null);
            return EmptyResponse.INSTANCE;
        }
    }

    @MsiApiMethod(name = "FileSystemManager.rmdir", request = DirParam.class)
    public void rmdir(DirParam dirParam, MsiContext msiContext) {
        Object[] objArr = {dirParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dad61f1a84a04a3ac74ab1990cd8d7b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dad61f1a84a04a3ac74ab1990cd8d7b3");
        } else {
            rmdirSync(dirParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.rmdirSync", request = DirParam.class)
    public EmptyResponse rmdirSync(DirParam dirParam, MsiContext msiContext) {
        String[] list;
        Object[] objArr = {dirParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41147323565f8e5a7258f400908fab0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41147323565f8e5a7258f400908fab0a");
        }
        String str = dirParam.dirPath;
        boolean z = dirParam.recursive;
        if (!d(str, msiContext) || a(str, msiContext.getFileProvider().c(), msiContext)) {
            return EmptyResponse.INSTANCE;
        }
        String a2 = msiContext.getFileProvider().a(str);
        File file = new File(a2);
        if (!file.exists()) {
            msiContext.onError(400, String.format("%s file not exist", str));
            return EmptyResponse.INSTANCE;
        } else if (!file.isDirectory()) {
            msiContext.onError(400, String.format("fail not a directory %s", str));
            return EmptyResponse.INSTANCE;
        } else if (!z && (list = file.list()) != null && list.length > 0) {
            msiContext.onError(400, "fail directory not empty");
            return EmptyResponse.INSTANCE;
        } else {
            try {
                if (!d.e(a2)) {
                    msiContext.onError(401, String.format("permission denied, remove \"%s\"", a2));
                    return EmptyResponse.INSTANCE;
                }
                msiContext.onSuccess(null);
                return EmptyResponse.INSTANCE;
            } catch (SecurityException unused) {
                msiContext.onError(401, String.format("permission denied, remove \"%s\"", a2));
                return EmptyResponse.INSTANCE;
            }
        }
    }

    @MsiApiMethod(name = "FileSystemManager.saveFile", request = FSMSaveFileParam.class, response = FSMSaveFileResponse.class)
    public void saveFile(FSMSaveFileParam fSMSaveFileParam, MsiContext msiContext) {
        Object[] objArr = {fSMSaveFileParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b9daba6df59f4f76d0fdec590abaec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b9daba6df59f4f76d0fdec590abaec8");
        } else {
            saveFileSync(fSMSaveFileParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.saveFileSync", request = FSMSaveFileParam.class, response = FSMSaveFileResponse.class)
    public FSMSaveFileResponse saveFileSync(FSMSaveFileParam fSMSaveFileParam, MsiContext msiContext) {
        String str;
        Object[] objArr = {fSMSaveFileParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e3c6e1d2ad3cdc66fb909732ab592a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (FSMSaveFileResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e3c6e1d2ad3cdc66fb909732ab592a5");
        }
        String str2 = fSMSaveFileParam.tempFilePath;
        String str3 = fSMSaveFileParam.filePath;
        if (!d(str2, msiContext) || !e(str2, msiContext) || f(str2, msiContext)) {
            return new FSMSaveFileResponse();
        }
        String str4 = null;
        if (!TextUtils.isEmpty(str3)) {
            String a2 = msiContext.getFileProvider().a(str3);
            if (!d(a2, msiContext) || a(str3, msiContext.getFileProvider().c(), msiContext)) {
                return new FSMSaveFileResponse();
            }
            File file = new File(a2);
            if (file.getParentFile().exists()) {
                str4 = file.getAbsolutePath();
            } else {
                msiContext.onError(400, String.format("%s file not exist", file.getParentFile().getAbsolutePath()));
                return new FSMSaveFileResponse();
            }
        }
        File file2 = new File(msiContext.getFileProvider().a(str2));
        if (!file2.isFile()) {
            msiContext.onError(400, "%s  is not a file");
            return new FSMSaveFileResponse();
        } else if (!a((int) file2.length(), msiContext)) {
            msiContext.onError(400, "fail the maximum size of the file storage limit is exceeded");
            return new FSMSaveFileResponse();
        } else {
            if (TextUtils.isEmpty(str4)) {
                str4 = "store_" + d.c(file2) + d.b(str2);
                str = msiContext.getFileProvider().a(a(str4, msiContext));
            } else {
                str = str4;
            }
            File file3 = new File(str);
            file3.delete();
            if (file2.renameTo(file3)) {
                if (file3.exists()) {
                    FSMSaveFileResponse fSMSaveFileResponse = new FSMSaveFileResponse();
                    if (TextUtils.isEmpty(fSMSaveFileParam.filePath)) {
                        fSMSaveFileResponse.savedFilePath = msiContext.getFileProvider().b(str4);
                    } else {
                        fSMSaveFileResponse.savedFilePath = str3;
                    }
                    msiContext.onSuccess(fSMSaveFileResponse);
                    file2.delete();
                    return fSMSaveFileResponse;
                }
                msiContext.onError(500, "save file error");
                return new FSMSaveFileResponse();
            }
            msiContext.onError(401, String.format("permission denied, open \"%s\"", fSMSaveFileParam.filePath));
            return new FSMSaveFileResponse();
        }
    }

    private Object a(StatParam statParam, MsiContext msiContext) {
        Object[] objArr = {statParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9127856d9c44c86df89d8c8d058803d", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9127856d9c44c86df89d8c8d058803d");
        }
        String str = statParam.path;
        boolean z = statParam.recursive;
        if (!d(str, msiContext) || !e(str, msiContext) || f(str, msiContext)) {
            return new StatResponse();
        }
        File file = new File(msiContext.getFileProvider().a(str));
        if (file.isDirectory() && z) {
            return a(z, file);
        }
        return a(file);
    }

    @MsiApiMethod(name = "FileSystemManager.stat", request = StatParam.class, response = StatResponse.class)
    public void stat(StatParam statParam, MsiContext msiContext) {
        Object[] objArr = {statParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a5cdb61b5962db08725a1a3e732e931", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a5cdb61b5962db08725a1a3e732e931");
            return;
        }
        StatResponse statResponse = new StatResponse();
        statResponse.stats = a(statParam, msiContext);
        msiContext.onSuccess(statResponse);
    }

    @MsiApiMethod(name = "FileSystemManager.statSync", request = StatParam.class, response = Object.class)
    public Object statSync(StatParam statParam, MsiContext msiContext) {
        Object[] objArr = {statParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b859f7f8cb90d34e354283901d8eb86", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b859f7f8cb90d34e354283901d8eb86") : a(statParam, msiContext);
    }

    private StatsData.Stats a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f22a11c8a0ba17b59fca456050164c0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (StatsData.Stats) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f22a11c8a0ba17b59fca456050164c0e");
        }
        d.a a2 = d.a(file.getAbsolutePath());
        StatsData.Stats stats = new StatsData.Stats();
        stats.lastAccessedTime = a2.b;
        stats.lastModifiedTime = file.lastModified() / 1000;
        stats.size = file.length();
        stats.mode = a2.a;
        if (file.isDirectory()) {
            stats.isDirectory = true;
        } else {
            stats.isFile = true;
        }
        return stats;
    }

    private StatsData[] a(boolean z, File file) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5595bd183c0396747b7c4ac10f494e5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (StatsData[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5595bd183c0396747b7c4ac10f494e5c");
        }
        String absolutePath = file.getAbsolutePath();
        int length = absolutePath.endsWith("/") ? absolutePath.length() : absolutePath.length() + 1;
        HashSet hashSet = new HashSet();
        d.a(file.getAbsolutePath(), hashSet, z, true);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            File file2 = (File) it.next();
            StatsData statsData = new StatsData();
            if (file2.getAbsolutePath().equals(absolutePath)) {
                statsData.path = "/";
            } else {
                statsData.path = file2.getAbsolutePath().substring(length);
            }
            statsData.stats = a(file2);
            arrayList.add(statsData);
        }
        return (StatsData[]) arrayList.toArray(new StatsData[0]);
    }

    @MsiApiMethod(name = "FileSystemManager.truncate", request = TruncateParam.class)
    public void truncate(TruncateParam truncateParam, MsiContext msiContext) {
        Object[] objArr = {truncateParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f7dc855beee880b66d5480817a59911", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f7dc855beee880b66d5480817a59911");
        } else {
            truncateSync(truncateParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.truncateSync", request = TruncateParam.class)
    public EmptyResponse truncateSync(TruncateParam truncateParam, MsiContext msiContext) {
        Object[] objArr = {truncateParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ec1a384c358ab3916cf7446f5fdf89f", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ec1a384c358ab3916cf7446f5fdf89f");
        }
        String str = truncateParam.filePath;
        long j = truncateParam.length;
        a(str, null, j < 0 ? 0L : j, msiContext);
        return EmptyResponse.INSTANCE;
    }

    @MsiApiMethod(name = "FileSystemManager.unlink", request = UnlinkParam.class)
    public void unlink(UnlinkParam unlinkParam, MsiContext msiContext) {
        Object[] objArr = {unlinkParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5110f55f104bb9de3a27475e377d026", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5110f55f104bb9de3a27475e377d026");
        } else {
            unlinkSync(unlinkParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.unlinkSync", request = UnlinkParam.class)
    public EmptyResponse unlinkSync(UnlinkParam unlinkParam, MsiContext msiContext) {
        Object[] objArr = {unlinkParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c20a07cd7eae2a5d3a3a1188d441f47", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c20a07cd7eae2a5d3a3a1188d441f47");
        }
        String str = unlinkParam.filePath;
        if (!d(str, msiContext) || f(str, msiContext) || !e(str, msiContext)) {
            return EmptyResponse.INSTANCE;
        }
        File file = new File(msiContext.getFileProvider().a(str));
        if (file.isDirectory()) {
            msiContext.onError(400, String.format("fail operation not permitted, unlink %s", str));
            return EmptyResponse.INSTANCE;
        } else if (!file.delete()) {
            msiContext.onError(401, String.format("permission denied, remove \"%s\"", str));
            return EmptyResponse.INSTANCE;
        } else {
            msiContext.onSuccess(null);
            return EmptyResponse.INSTANCE;
        }
    }

    @MsiApiMethod(name = "FileSystemManager.unzip", request = UnzipParam.class)
    public void unzip(UnzipParam unzipParam, MsiContext msiContext) {
        boolean z;
        Object[] objArr = {unzipParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b4b8160dd3f8ce94a86c6f5abbdb10e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b4b8160dd3f8ce94a86c6f5abbdb10e");
            return;
        }
        String str = unzipParam.zipFilePath;
        String str2 = unzipParam.targetPath;
        if (d(str, msiContext) && d(str2, msiContext) && e(str, msiContext) && !a(str2, msiContext.getFileProvider().c(), msiContext)) {
            String a2 = msiContext.getFileProvider().a(str);
            String a3 = msiContext.getFileProvider().a(str2);
            File file = new File(str);
            File file2 = new File(str2);
            Object[] objArr2 = {file, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5369ad280fafcc04814e8c9c2a358a95", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5369ad280fafcc04814e8c9c2a358a95")).booleanValue();
            } else if (file.isFile()) {
                z = true;
            } else {
                msiContext.onError(400, String.format("%s  is not a file", file.getAbsolutePath()));
                z = false;
            }
            if (z) {
                File parentFile = file2.getParentFile();
                if (parentFile == null || !parentFile.exists() || !file2.getParentFile().isDirectory()) {
                    msiContext.onError(400, String.format("fail not a directory %s", str2));
                } else if (!a((int) c.a(a2), msiContext)) {
                    msiContext.onError(400, "fail the maximum size of the file storage limit is exceeded");
                } else if (f.a(a2, a3)) {
                    msiContext.onSuccess(null);
                } else {
                    msiContext.onError(401, String.format("permission denied, open \"%s\"", str2));
                }
            }
        }
    }

    @MsiApiMethod(name = "FileSystemManager.write", request = WriteFileParam.class, response = WriteResponse.class)
    public void write(WriteParam writeParam, MsiContext msiContext) {
        Object[] objArr = {writeParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e87535c74cefc127a444a4ba1f05f40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e87535c74cefc127a444a4ba1f05f40");
        } else {
            writeSync(writeParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.writeSync", request = WriteFileParam.class, response = WriteResponse.class)
    public WriteResponse writeSync(WriteParam writeParam, MsiContext msiContext) {
        Object[] objArr = {writeParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "730590da8c7b3249e8eb1aa1641808a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (WriteResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "730590da8c7b3249e8eb1aa1641808a4");
        }
        String str = writeParam.fd;
        String str2 = writeParam.data;
        int i = writeParam.offset;
        int i2 = writeParam.length;
        String str3 = writeParam.encoding;
        String str4 = b.get(str);
        String a2 = a(str);
        if (str2 == null) {
            WriteResponse writeResponse = new WriteResponse();
            msiContext.onSuccess(writeResponse);
            return writeResponse;
        } else if (!d(str4, msiContext) || !e(str4, msiContext)) {
            return new WriteResponse();
        } else {
            if (a2.contains("a") || r.o.equals(a2)) {
                msiContext.onError(401, String.format("permission denied, open \"%s\"", str4));
                return new WriteResponse();
            }
            File file = new File(msiContext.getFileProvider().a(str4));
            if (TextUtils.isEmpty(str3)) {
                str3 = "utf-8";
            }
            a.InterfaceC0499a a3 = a.a(str3);
            if (a3 == null) {
                msiContext.onError(400, "invalid encoding");
                return new WriteResponse();
            }
            try {
                ByteBuffer a4 = a3.a(str2.substring(i, i2));
                if (a4 == null || !a4.hasArray()) {
                    msiContext.onError(401, String.format("permission denied, open \"%s\"", str4));
                    return new WriteResponse();
                } else if (!a(a4.array().length, msiContext)) {
                    msiContext.onError(400, "fail the maximum size of the file storage limit is exceeded");
                    return new WriteResponse();
                } else if (a(file, a4, false) == -1) {
                    msiContext.onError(401, String.format("permission denied, open \"%s\"", str4));
                    return new WriteResponse();
                } else {
                    WriteResponse writeResponse2 = new WriteResponse();
                    writeResponse2.bytesWritten = i2;
                    msiContext.onSuccess(writeResponse2);
                    return writeResponse2;
                }
            } catch (Exception unused) {
                msiContext.onError(401, String.format("permission denied, open \"%s\"", str4));
                return new WriteResponse();
            }
        }
    }

    @MsiApiMethod(name = "FileSystemManager.writeFile", request = WriteFileParam.class)
    public void writeFile(WriteFileParam writeFileParam, MsiContext msiContext) {
        Object[] objArr = {writeFileParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca576f68df44306368038e1a2888b8be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca576f68df44306368038e1a2888b8be");
        } else {
            writeFileSync(writeFileParam, msiContext);
        }
    }

    @MsiApiMethod(name = "FileSystemManager.writeFileSync", request = WriteFileParam.class)
    public EmptyResponse writeFileSync(WriteFileParam writeFileParam, MsiContext msiContext) {
        Object[] objArr = {writeFileParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0ab4c3add8c262542fe65082fc308cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0ab4c3add8c262542fe65082fc308cd");
        }
        String str = writeFileParam.filePath;
        String str2 = writeFileParam.data;
        String str3 = writeFileParam.encoding;
        if (str2 == null || str2.length() == 0) {
            msiContext.onSuccess(null);
            return EmptyResponse.INSTANCE;
        } else if (!d(str, msiContext) || a(str, msiContext.getFileProvider().c(), msiContext)) {
            return EmptyResponse.INSTANCE;
        } else {
            File file = new File(msiContext.getFileProvider().a(str));
            if (!file.getParentFile().exists()) {
                msiContext.onError(400, String.format("fail no such file or directory %s", str));
                return EmptyResponse.INSTANCE;
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = "utf-8";
            }
            a.InterfaceC0499a a2 = a.a(str3);
            if (a2 == null) {
                msiContext.onError(400, "invalid encoding");
                return EmptyResponse.INSTANCE;
            }
            try {
                ByteBuffer a3 = a2.a(str2);
                if (a3 == null || !a3.hasArray()) {
                    msiContext.onError(401, String.format("permission denied, open \"%s\"", str));
                    return EmptyResponse.INSTANCE;
                } else if (a(file, a3, writeFileParam.append) <= 0) {
                    msiContext.onError(401, String.format("permission denied, open \"%s\"", str));
                    return EmptyResponse.INSTANCE;
                } else {
                    msiContext.onSuccess(null);
                    return EmptyResponse.INSTANCE;
                }
            } catch (Exception unused) {
                msiContext.onError(401, String.format("permission denied, open \"%s\"", str));
                return EmptyResponse.INSTANCE;
            }
        }
    }

    private boolean a(int i, MsiContext msiContext) {
        Object[] objArr = {Integer.valueOf(i), msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6d474a902ddff736cde8693eaabeda4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6d474a902ddff736cde8693eaabeda4")).booleanValue() : ((double) (a(msiContext) + ((long) i))) <= 2.097152E8d;
    }

    private long a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a36de67b3030d73d6737c589dbd6a7b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a36de67b3030d73d6737c589dbd6a7b")).longValue() : (long) (c.a(msiContext.getFileProvider().c(), 1) + c.a(d.a(msiContext), 1));
    }

    private String a(String str, MsiContext msiContext) {
        Object[] objArr = {str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be153c8003f2acf5be3e31f91c0d9fe7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be153c8003f2acf5be3e31f91c0d9fe7");
        }
        return msiContext.getFileProvider().b(DefaultHeaderService.KEY_STORE + File.separator + str);
    }

    private boolean b(String str, MsiContext msiContext) {
        Object[] objArr = {str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfd6801b16577c9ced1bd4a67d4d9057", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfd6801b16577c9ced1bd4a67d4d9057")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (msiContext.getFileProvider() instanceof com.meituan.msi.provider.b) {
            return str.startsWith("msifile://store");
        }
        return str.startsWith("wdfile://store");
    }

    private long c(String str, MsiContext msiContext) {
        Object[] objArr = {str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02a0c5616d05b9ac1e5c07f6b2cf0b3a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02a0c5616d05b9ac1e5c07f6b2cf0b3a")).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return msiContext.getSharedPreferencesProvider().a().getLong(str, 0L);
    }

    private boolean d(String str, MsiContext msiContext) {
        Object[] objArr = {str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4764a45fed63c53c5c3bb61f9bd6831c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4764a45fed63c53c5c3bb61f9bd6831c")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            msiContext.onError(400, "file path is null");
            return false;
        }
        return true;
    }

    private boolean e(String str, MsiContext msiContext) {
        Object[] objArr = {str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72d5e01608c9ccb8a17358499b015174", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72d5e01608c9ccb8a17358499b015174")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String a2 = msiContext.getFileProvider().a(str);
        if (TextUtils.isEmpty(a2)) {
            msiContext.onError(400, String.format("%s file path is error", str));
            return false;
        } else if (new File(a2).exists()) {
            return true;
        } else {
            msiContext.onError(400, String.format("%s file not exist", a2));
            return false;
        }
    }

    private long a(File file, MsiContext msiContext) {
        Object[] objArr = {file, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4844c3e925756ddbd2716dd140c60e98", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4844c3e925756ddbd2716dd140c60e98")).longValue();
        }
        long j = 0;
        try {
            Object[] objArr2 = {file};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cc37367d7d22a48e0f4cf41b1a4d0cf5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cc37367d7d22a48e0f4cf41b1a4d0cf5")).longValue();
            }
            if (file.exists()) {
                j = new FileInputStream(file).available();
            } else {
                file.createNewFile();
                com.meituan.msi.log.a.a("获取文件大小失败，文件不存在!");
            }
            return j;
        } catch (Exception e) {
            msiContext.onError(500, file.getAbsolutePath() + StringUtil.SPACE + e.getMessage());
            return 0L;
        }
    }

    private boolean b(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "087b94ed02058074a91367b4d2d758d9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "087b94ed02058074a91367b4d2d758d9")).booleanValue() : file.exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(java.io.File r12, java.nio.ByteBuffer r13, boolean r14) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            java.lang.Byte r1 = java.lang.Byte.valueOf(r14)
            r2 = 2
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.msi.api.file.FileApi.a
            java.lang.String r10 = "688e5e457ac11bc499fec65b84ce8456"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2c
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            return r12
        L2c:
            r0 = 0
            r1 = -1
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L5b java.io.FileNotFoundException -> L65
            r2.<init>(r12, r14)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L5b java.io.FileNotFoundException -> L65
            java.nio.channels.FileChannel r12 = r2.getChannel()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L5b java.io.FileNotFoundException -> L65
            int r14 = r12.write(r13)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L5c java.io.FileNotFoundException -> L66
            r13.compact()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b java.io.FileNotFoundException -> L4d
            r12.close()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b java.io.FileNotFoundException -> L4d
            if (r12 == 0) goto L47
            r12.close()     // Catch: java.io.IOException -> L47
        L47:
            return r14
        L48:
            r13 = move-exception
            r1 = r14
            goto L53
        L4b:
            goto L5d
        L4d:
            goto L67
        L4f:
            r13 = move-exception
            goto L53
        L51:
            r13 = move-exception
            r12 = r0
        L53:
            if (r12 == 0) goto L5a
            r12.close()     // Catch: java.io.IOException -> L59
            goto L5a
        L59:
            return r1
        L5a:
            throw r13
        L5b:
            r12 = r0
        L5c:
            r14 = -1
        L5d:
            if (r12 == 0) goto L64
            r12.close()     // Catch: java.io.IOException -> L63
            goto L64
        L63:
            return r14
        L64:
            return r1
        L65:
            r12 = r0
        L66:
            r14 = -1
        L67:
            if (r12 == 0) goto L6e
            r12.close()     // Catch: java.io.IOException -> L6d
            goto L6e
        L6d:
            return r14
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.file.FileApi.a(java.io.File, java.nio.ByteBuffer, boolean):int");
    }

    private ReadZipEntryResponse.FileItem a(ZipFile zipFile, ZipEntry zipEntry, String str, int i, int i2) {
        byte[] bArr;
        Throwable th;
        InputStream inputStream;
        Object a2;
        Object[] objArr = {zipFile, zipEntry, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f0c855b0f1e7af7bfc1766af5ee4c8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadZipEntryResponse.FileItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f0c855b0f1e7af7bfc1766af5ee4c8c");
        }
        ReadZipEntryResponse.FileItem fileItem = new ReadZipEntryResponse.FileItem();
        if (zipEntry == null) {
            return fileItem;
        }
        if (i2 > 0) {
            bArr = new byte[i2];
        } else if (((int) zipEntry.getSize()) <= i) {
            fileItem.errMsg = "invalid position param!";
            return fileItem;
        } else {
            bArr = new byte[(int) (zipEntry.getSize() - i)];
        }
        InputStream inputStream2 = null;
        try {
            try {
                inputStream = zipFile.getInputStream(zipEntry);
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            inputStream.skip(i);
            inputStream.read(bArr);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (TextUtils.isEmpty(str)) {
                a2 = Base64.encode(bArr, 0);
            } else {
                a.InterfaceC0499a a3 = a.a(str);
                if (a3 == null) {
                    fileItem.errMsg = "invalid encoding";
                    return fileItem;
                }
                a2 = a3.a(ByteBuffer.wrap(bArr));
            }
            fileItem.data = a2;
            return fileItem;
        } catch (IOException unused2) {
            inputStream2 = inputStream;
            fileItem.errMsg = String.format("permission denied, open \"%s\"", zipEntry.getName());
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            return fileItem;
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            throw th;
        }
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2996a46706762f1f4030c8c399ca9309", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2996a46706762f1f4030c8c399ca9309");
        }
        int indexOf = str.indexOf(CommonConstant.Symbol.UNDERLINE);
        return indexOf <= 0 ? "" : str.substring(0, indexOf);
    }

    private void a(String str, String str2, long j, MsiContext msiContext) {
        long j2 = j;
        Object[] objArr = {str, str2, new Long(j2), msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fd29434a88fa5c9f4bbed35c39a3224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fd29434a88fa5c9f4bbed35c39a3224");
        } else if (d(str, msiContext) && e(str, msiContext)) {
            if (j2 < 0) {
                j2 = 0;
            }
            String a2 = msiContext.getFileProvider().a(str);
            if (str2 == null && a(str, msiContext.getFileProvider().c(), msiContext)) {
                return;
            }
            File file = new File(a2);
            long length = file.length();
            int i = (j2 > length ? 1 : (j2 == length ? 0 : -1));
            if (i < 0) {
                if (str2 != null && !"r+".equals(str2) && !str2.contains("w")) {
                    msiContext.onError(401, String.format("permission denied, open \"%s\"", str));
                    return;
                }
                try {
                    new FileOutputStream(file, true).getChannel().truncate(j2);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    msiContext.onError(400, "file not find");
                    return;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    msiContext.onError(401, String.format("permission denied, open \"%s\"", str));
                    return;
                }
            } else if (i > 0) {
                if (r.o.equals(str2)) {
                    msiContext.onError(401, String.format("permission denied, open \"%s\"", str));
                    return;
                }
                try {
                    new FileOutputStream(file, true).write(new byte[(int) (j2 - length)]);
                } catch (FileNotFoundException e3) {
                    e3.printStackTrace();
                    msiContext.onError(400, "file not find");
                    return;
                } catch (IOException e4) {
                    e4.printStackTrace();
                    msiContext.onError(401, String.format("permission denied, open \"%s\"", str));
                    return;
                }
            }
            msiContext.onSuccess(null);
        }
    }

    private boolean f(String str, MsiContext msiContext) {
        Object[] objArr = {str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60c0b0c4f55d88d96caf5b2a90ef0b95", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60c0b0c4f55d88d96caf5b2a90ef0b95")).booleanValue();
        }
        if (b.a(msiContext.getFileProvider().a(str), msiContext.getFileProvider())) {
            return false;
        }
        msiContext.onError(400, String.format("%s file scope failed", str));
        return true;
    }

    private boolean a(String str, String str2, MsiContext msiContext) {
        Object[] objArr = {str, str2, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f588b93b728efdcaa88b2f932f55ba14", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f588b93b728efdcaa88b2f932f55ba14")).booleanValue();
        }
        if (b.a(msiContext.getFileProvider().a(str), str2)) {
            return false;
        }
        msiContext.onError(400, String.format("%s file scope failed", str));
        return true;
    }
}
