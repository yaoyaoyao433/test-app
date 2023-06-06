package com.meituan.robust.assistant.process;

import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ProcessSafeReadFile extends ProcessSafeOperateAbstract<String> {
    private File file;
    private String lockFilePath;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meituan.robust.assistant.process.ProcessSafeOperateAbstract
    public String failure() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meituan.robust.assistant.process.ProcessSafeOperateAbstract
    public String lockFailure() {
        return null;
    }

    public ProcessSafeReadFile(File file, String str) {
        this.file = file;
        this.lockFilePath = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meituan.robust.assistant.process.ProcessSafeOperateAbstract
    public String operate() {
        return FileUtils.readFile(this.file);
    }

    @Override // com.meituan.robust.assistant.process.ProcessSafeOperateAbstract
    protected String getLockPath() {
        return this.lockFilePath;
    }
}
