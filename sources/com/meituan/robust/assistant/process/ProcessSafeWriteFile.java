package com.meituan.robust.assistant.process;

import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ProcessSafeWriteFile extends ProcessSafeOperateAbstract<Boolean> {
    private String content;
    private File file;
    private String lockFilePath;

    public ProcessSafeWriteFile(File file, String str, String str2) {
        this.file = file;
        this.content = str;
        this.lockFilePath = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.robust.assistant.process.ProcessSafeOperateAbstract
    public Boolean operate() {
        FileUtils.writeFile(this.file, this.content);
        return Boolean.FALSE;
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
