package com.sankuai.xm.file.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TransferContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long currentProgress;
    private String key;
    private long lastProgress;
    private long length;
    private String localPath;
    private FileInfoBean mFileInfo;
    private int mHttpCode;
    private int mServerResCode;
    private String mServerResMessage;
    private long ownerId;
    private int ownerType;
    private String serverPath;
    private int state;
    private StatisticEntry statisticEntry;
    private int taskId;
    private int taskType;
    private int transferType;

    public TransferContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6da7846666227e21bc5b146b24c02e7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6da7846666227e21bc5b146b24c02e7a");
            return;
        }
        this.mHttpCode = 200;
        this.mServerResCode = 0;
        this.transferType = 1;
        this.ownerType = 2;
        this.ownerId = 0L;
        this.serverPath = "";
        this.localPath = "";
        this.currentProgress = 0L;
        this.lastProgress = 0L;
        this.length = 0L;
        this.state = 3;
        this.taskType = 0;
        this.key = "";
        this.taskId = 0;
        this.statisticEntry = new StatisticEntry();
        this.mFileInfo = new FileInfoBean();
    }

    public int getTransferType() {
        return this.transferType;
    }

    public void setTransferType(int i) {
        this.transferType = i;
    }

    public int getOwnerType() {
        return this.ownerType;
    }

    public void setOwnerType(int i) {
        this.ownerType = i;
    }

    public long getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1c3b18f4af4be9a4699da522bfe7186", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1c3b18f4af4be9a4699da522bfe7186");
        } else {
            this.ownerId = j;
        }
    }

    public String getServerPath() {
        return this.serverPath;
    }

    public void setServerPath(String str) {
        this.serverPath = str;
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public void setLocalPath(String str) {
        this.localPath = str;
    }

    public long getLastProgress() {
        return this.lastProgress;
    }

    public void setLastProgress(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f0eee2d2e74c4228c16674ae411fb7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f0eee2d2e74c4228c16674ae411fb7c");
        } else {
            this.lastProgress = j;
        }
    }

    public long getCurrentProgress() {
        return this.currentProgress;
    }

    public void setCurrentProgress(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56eb3b0ba26af4d516bc495c8aea69a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56eb3b0ba26af4d516bc495c8aea69a4");
        } else {
            this.currentProgress = j;
        }
    }

    public long getLength() {
        return this.length;
    }

    public void setLength(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "836e2722d0ee2d398d0cfece3a41977c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "836e2722d0ee2d398d0cfece3a41977c");
        } else {
            this.length = j;
        }
    }

    public synchronized int getState() {
        return this.state;
    }

    public synchronized void setState(int i) {
        this.state = i;
    }

    public int getTaskType() {
        return this.taskType;
    }

    public void setTaskType(int i) {
        this.taskType = i;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public int getTaskId() {
        return this.taskId;
    }

    public void setTaskId(int i) {
        this.taskId = i;
    }

    public StatisticEntry getStatisticEntry() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c75f7aa1b7cf15590ee673cd2bb9deae", 6917529027641081856L)) {
            return (StatisticEntry) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c75f7aa1b7cf15590ee673cd2bb9deae");
        }
        if (this.statisticEntry == null) {
            StatisticEntry statisticEntry = new StatisticEntry();
            this.statisticEntry = statisticEntry;
            return statisticEntry;
        }
        return this.statisticEntry;
    }

    public void setStatisticEntry(StatisticEntry statisticEntry) {
        this.statisticEntry = statisticEntry;
    }

    public FileInfoBean getFileInfo() {
        return this.mFileInfo;
    }

    public void setFileInfo(FileInfoBean fileInfoBean) {
        this.mFileInfo = fileInfoBean;
    }

    public int getHttpCode() {
        return this.mHttpCode;
    }

    public void setHttpCode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d7bce7cd0f647316e5609dd534cc3b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d7bce7cd0f647316e5609dd534cc3b0");
            return;
        }
        this.mHttpCode = i;
        getStatisticEntry().httpCode = i;
    }

    public void setServerResCode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8fd538b6df4005cb864bd522c307566", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8fd538b6df4005cb864bd522c307566");
            return;
        }
        this.mServerResCode = i;
        getStatisticEntry().bizCode = i;
    }

    public int getServerResCode() {
        return this.mServerResCode;
    }

    public String getServerResMessage() {
        return this.mServerResMessage;
    }

    public void setServerResMessage(String str) {
        this.mServerResMessage = str;
    }
}
