package com.sankuai.waimai.platform.db.dao;

import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.log.a;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class BaseAbstractDao<T, K> extends AbstractDao<T, K> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public BaseAbstractDao(DaoConfig daoConfig) {
        super(daoConfig);
        Object[] objArr = {daoConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69026e29503db0fcd631a124da24983d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69026e29503db0fcd631a124da24983d");
        }
    }

    public BaseAbstractDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        Object[] objArr = {daoConfig, daoSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c63db3fe659cacf02ab1739f93b0cef2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c63db3fe659cacf02ab1739f93b0cef2");
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public long insert(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "411077bec4ac2e7aadedee15741e3964", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "411077bec4ac2e7aadedee15741e3964")).longValue();
        }
        try {
            return super.insert(t);
        } catch (Exception e) {
            a.a(e);
            ae.a(b.a, e.getMessage());
            return -1L;
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public void update(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "957e7946f92d3ff92a0f296f15dcb064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "957e7946f92d3ff92a0f296f15dcb064");
            return;
        }
        try {
            super.update(t);
        } catch (Exception e) {
            a.a(e);
            ae.a(b.a, e.getMessage());
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public void delete(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "470afba3f4ae083bc7823d144f9de6b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "470afba3f4ae083bc7823d144f9de6b7");
            return;
        }
        try {
            super.delete(t);
        } catch (Exception e) {
            a.a(e);
            ae.a(b.a, e.getMessage());
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public void deleteAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52d5c2efc5d45914dee11052a88b725d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52d5c2efc5d45914dee11052a88b725d");
            return;
        }
        try {
            super.deleteAll();
        } catch (Exception e) {
            a.a(e);
            ae.a(b.a, e.getMessage());
        }
    }
}
