package com.meituan.robust.assistant.process;

import com.meituan.robust.assistant.OkHttpUtils;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ProcessSafeDownloadFile extends ProcessSafeOperateAbstract<Boolean> {
    private File file;
    private String lockFilePath;
    private String url;

    public ProcessSafeDownloadFile(String str, File file, String str2) {
        this.url = str;
        this.file = file;
        this.lockFilePath = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.robust.assistant.process.ProcessSafeOperateAbstract
    public Boolean operate() {
        boolean z;
        try {
            z = OkHttpUtils.simpleDownload(this.url, this.file, true).booleanValue();
        } catch (Throwable unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.robust.assistant.process.ProcessSafeOperateAbstract
    public Boolean failure() {
        return Boolean.FALSE;
    }

    @Override // com.meituan.robust.assistant.process.ProcessSafeOperateAbstract
    protected String getLockPath() {
        return this.lockFilePath;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.robust.assistant.process.ProcessSafeOperateAbstract
    public Boolean lockFailure() {
        return Boolean.FALSE;
    }
}
