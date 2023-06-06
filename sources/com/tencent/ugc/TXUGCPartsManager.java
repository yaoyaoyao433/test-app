package com.tencent.ugc;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.sankuai.waimai.launcher.util.aop.b;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXUGCPartsManager {
    private final Context mContext;
    private int mDuration;
    private final String TAG = "TXUGCPartsManager";
    private CopyOnWriteArrayList<PartInfo> mPartsList = new CopyOnWriteArrayList<>();
    private ArrayList<IPartsManagerListener> iPartsManagerObservers = new ArrayList<>();

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface IPartsManagerListener {
        void onDeleteAllParts();

        void onDeleteLastPart();
    }

    public TXUGCPartsManager(Context context) {
        this.mContext = context;
    }

    public synchronized void setPartsManagerObserver(IPartsManagerListener iPartsManagerListener) {
        if (iPartsManagerListener != null) {
            if (!this.iPartsManagerObservers.contains(iPartsManagerListener)) {
                this.iPartsManagerObservers.add(iPartsManagerListener);
            }
        }
    }

    public synchronized void removePartsManagerObserver(IPartsManagerListener iPartsManagerListener) {
        if (iPartsManagerListener != null) {
            this.iPartsManagerObservers.remove(iPartsManagerListener);
        }
    }

    public void addClipInfo(PartInfo partInfo) {
        this.mPartsList.add(partInfo);
        this.mDuration = (int) (this.mDuration + partInfo.getDuration());
    }

    public void insertPart(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            TXCLog.e("TXUGCPartsManager", "insertPart, videoPath is empty, ignore");
            return;
        }
        long duration = TXVideoInfoReader.getInstance(this.mContext).getDuration(str);
        if (duration <= 0) {
            TXCLog.e("TXUGCPartsManager", "insertPart, duration = " + duration);
            return;
        }
        this.mDuration = (int) (this.mDuration + duration);
        PartInfo partInfo = new PartInfo();
        partInfo.setPath(str);
        partInfo.setDuration(duration);
        this.mPartsList.add(i, partInfo);
    }

    public int getDuration() {
        return this.mDuration;
    }

    public List<String> getPartsPathList() {
        ArrayList arrayList = new ArrayList();
        Iterator<PartInfo> it = this.mPartsList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPath());
        }
        return arrayList;
    }

    public void deleteLastPart() {
        if (this.mPartsList.size() != 0) {
            PartInfo remove = this.mPartsList.remove(this.mPartsList.size() - 1);
            this.mDuration = (int) (this.mDuration - remove.getDuration());
            deleteFile(remove.getPath());
            callbackDeleteLastPart();
        }
    }

    public void deletePart(int i) {
        if (i > 0 && this.mPartsList.size() != 0) {
            PartInfo remove = this.mPartsList.remove(i - 1);
            this.mDuration = (int) (this.mDuration - remove.getDuration());
            deleteFile(remove.getPath());
        }
    }

    public void deleteAllParts() {
        Iterator<PartInfo> it = this.mPartsList.iterator();
        while (it.hasNext()) {
            deleteFile(it.next().getPath());
        }
        this.mPartsList.clear();
        this.mDuration = 0;
        callbackDeleteAllParts();
    }

    private void callbackDeleteLastPart() {
        synchronized (this) {
            Iterator<IPartsManagerListener> it = this.iPartsManagerObservers.iterator();
            while (it.hasNext()) {
                it.next().onDeleteLastPart();
            }
        }
    }

    private void callbackDeleteAllParts() {
        synchronized (this) {
            Iterator<IPartsManagerListener> it = this.iPartsManagerObservers.iterator();
            while (it.hasNext()) {
                it.next().onDeleteAllParts();
            }
        }
    }

    private void deleteFile(final String str) {
        b.a(new AsyncTask() { // from class: com.tencent.ugc.TXUGCPartsManager.1
            @Override // android.os.AsyncTask
            protected Object doInBackground(Object[] objArr) {
                File file = new File(str);
                if (file.exists()) {
                    file.delete();
                    return null;
                }
                return null;
            }
        }, AsyncTask.SERIAL_EXECUTOR, new Object[0]);
    }
}
