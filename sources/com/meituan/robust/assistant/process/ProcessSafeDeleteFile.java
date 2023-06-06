package com.meituan.robust.assistant.process;

import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ProcessSafeDeleteFile extends ProcessSafeOperateAbstract<Boolean> {
    private File file;
    private String lockFilePath;

    public ProcessSafeDeleteFile(File file, String str) {
        this.file = file;
        this.lockFilePath = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.robust.assistant.process.ProcessSafeOperateAbstract
    public Boolean operate() {
        if (this.file.exists()) {
            return Boolean.valueOf(this.file.delete());
        }
        return Boolean.TRUE;
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
