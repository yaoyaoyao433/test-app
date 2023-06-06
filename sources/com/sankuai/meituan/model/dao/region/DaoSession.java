package com.sankuai.meituan.model.dao.region;

import android.database.sqlite.SQLiteDatabase;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.IdentityScopeType;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DaoSession extends AbstractDaoSession {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final RegionDefDao regionDefDao;
    private final DaoConfig regionDefDaoConfig;
    private final RegionLinkDao regionLinkDao;
    private final DaoConfig regionLinkDaoConfig;

    public DaoSession(SQLiteDatabase sQLiteDatabase, IdentityScopeType identityScopeType, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> map) {
        super(sQLiteDatabase);
        Object[] objArr = {sQLiteDatabase, identityScopeType, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c5c9fe7015504675fe5b7823ca8839c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c5c9fe7015504675fe5b7823ca8839c");
            return;
        }
        this.regionDefDaoConfig = map.get(RegionDefDao.class).m38clone();
        this.regionDefDaoConfig.initIdentityScope(identityScopeType);
        this.regionLinkDaoConfig = map.get(RegionLinkDao.class).m38clone();
        this.regionLinkDaoConfig.initIdentityScope(identityScopeType);
        this.regionDefDao = new RegionDefDao(this.regionDefDaoConfig, this);
        this.regionLinkDao = new RegionLinkDao(this.regionLinkDaoConfig, this);
        registerDao(RegionDef.class, this.regionDefDao);
        registerDao(RegionLink.class, this.regionLinkDao);
    }
}
