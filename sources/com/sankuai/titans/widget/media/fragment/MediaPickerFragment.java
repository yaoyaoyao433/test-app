package com.sankuai.titans.widget.media.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IPictureResultCallback;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.titans.result.TitansPictureUtil;
import com.sankuai.titans.widget.PickerBuilder;
import com.sankuai.titans.widget.SnackbarUtil;
import com.sankuai.titans.widget.media.MediaActivity;
import com.sankuai.titans.widget.media.adapter.PhotoGridAdapter;
import com.sankuai.titans.widget.media.entity.Photo;
import com.sankuai.titans.widget.media.entity.PhotoDirectory;
import com.sankuai.titans.widget.media.event.OnItemCheckListener;
import com.sankuai.titans.widget.media.event.OnPhotoClickListener;
import com.sankuai.titans.widget.media.utils.AndroidLifecycleUtils;
import com.sankuai.titans.widget.media.utils.ImageCaptureManager;
import com.sankuai.titans.widget.media.utils.MediaStoreHelper;
import com.sankuai.titans.widget.media.utils.SelectPhotoUtil;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MediaPickerFragment extends Fragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int SCROLL_THRESHOLD;
    private String accessToken;
    public Button btSwitchDirectory;
    private ImageCaptureManager captureManager;
    public int column;
    private List<PhotoDirectory> directories;
    private Map<String, PhotoDirectory> directoryHashMap;
    public String excludeExtName;
    public String includeExtName;
    private OnItemCheckListener itemCheckListener;
    private int mCurrentPage;
    private Picasso mGlideRequestManager;
    public int maxCount;
    public int maxDuration;
    public long maxFileSize;
    public int minDuration;
    private PhotoGridAdapter photoGridAdapter;
    public String resultFilePath;
    public boolean showAll;
    private boolean showGif;
    public boolean showVideoOnly;

    public MediaPickerFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d112e187fd411fc20ff6f2671c47396", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d112e187fd411fc20ff6f2671c47396");
            return;
        }
        this.SCROLL_THRESHOLD = 30;
        this.showAll = false;
        this.showVideoOnly = false;
        this.maxDuration = -1;
        this.minDuration = -1;
        this.maxCount = 9;
        this.maxFileSize = -1L;
        this.excludeExtName = null;
        this.includeExtName = null;
        this.showGif = false;
        this.resultFilePath = null;
        this.mCurrentPage = 0;
    }

    public static MediaPickerFragment newInstance(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4cfccd5a67d34f6b969ca9b84d4d7f37", RobustBitConfig.DEFAULT_VALUE)) {
            return (MediaPickerFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4cfccd5a67d34f6b969ca9b84d4d7f37");
        }
        Bundle bundle2 = new Bundle(bundle);
        MediaPickerFragment mediaPickerFragment = new MediaPickerFragment();
        mediaPickerFragment.setArguments(bundle2);
        return mediaPickerFragment;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z = false;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc9d736b7120035d450134d91e682dd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc9d736b7120035d450134d91e682dd5");
            return;
        }
        super.onCreate(bundle);
        setRetainInstance(true);
        this.mGlideRequestManager = Picasso.g(getContext());
        this.directories = new ArrayList();
        this.maxCount = getArguments().getInt(PickerBuilder.EXTRA_MAX_COUNT, this.maxCount);
        this.column = getArguments().getInt("column", 3);
        this.showAll = getArguments().getBoolean(PickerBuilder.EXTRA_SHOW_ALL, this.showAll);
        this.showVideoOnly = getArguments().getBoolean(PickerBuilder.EXTRA_SHOW_VIDEO_ONLY, this.showVideoOnly);
        if (getArguments().getBoolean(PickerBuilder.EXTRA_SHOW_CAMERA, true) && !this.showAll) {
            z = true;
        }
        boolean z2 = getArguments().getBoolean(PickerBuilder.EXTRA_PREVIEW_ENABLED, true);
        this.maxDuration = getArguments().getInt(PickerBuilder.EXTRA_VIDEO_MAX_DURATION, -1);
        this.minDuration = getArguments().getInt(PickerBuilder.EXTRA_VIDEO_MIN_DURATION, -1);
        this.maxFileSize = getArguments().getLong(PickerBuilder.EXTRA_MAX_FILE_SIZE, this.maxFileSize);
        this.excludeExtName = getArguments().getString(PickerBuilder.EXTRA_EXCLUDE_EXT_NAME, this.excludeExtName);
        this.includeExtName = getArguments().getString(PickerBuilder.EXTRA_INCLUDE_EXT_NAME, this.includeExtName);
        this.resultFilePath = getArguments().getString(PickerBuilder.KEY_FILE_PATH);
        this.accessToken = getArguments().getString(MediaActivity.KEY_ACCESS_TOKEN);
        this.photoGridAdapter = new PhotoGridAdapter(getActivity(), this.mGlideRequestManager, this.directories, getArguments().getStringArrayList(PickerBuilder.EXTRA_CHOSEN_ASSET_IDS), this.column);
        this.photoGridAdapter.setShowCamera(z);
        this.photoGridAdapter.setPreviewEnable(z2);
        Bundle bundle2 = new Bundle();
        this.showGif = getArguments().getBoolean(PickerBuilder.EXTRA_SHOW_GIF);
        bundle2.putBoolean(PickerBuilder.EXTRA_SHOW_GIF, this.showGif);
        bundle2.putBoolean(PickerBuilder.EXTRA_SHOW_ALL, this.showAll);
        bundle2.putBoolean(PickerBuilder.EXTRA_SHOW_VIDEO_ONLY, this.showVideoOnly);
        bundle2.putInt(PickerBuilder.EXTRA_VIDEO_MAX_DURATION, this.maxDuration);
        bundle2.putInt(PickerBuilder.EXTRA_VIDEO_MIN_DURATION, this.minDuration);
        bundle2.putLong(PickerBuilder.EXTRA_MAX_FILE_SIZE, this.maxFileSize);
        bundle2.putString(PickerBuilder.EXTRA_EXCLUDE_EXT_NAME, this.excludeExtName);
        bundle2.putString(PickerBuilder.EXTRA_INCLUDE_EXT_NAME, this.includeExtName);
        getDirector();
        this.captureManager = new ImageCaptureManager(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadMore() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a22bb898a8bc8ffbf83355d8949d2a65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a22bb898a8bc8ffbf83355d8949d2a65");
            return;
        }
        this.mCurrentPage++;
        getPhoto(this.mCurrentPage, this.directoryHashMap);
    }

    private void getDirector() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34da170b330631ad1131baf64788433d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34da170b330631ad1131baf64788433d");
        } else {
            SelectPhotoUtil.getDirector(getContext(), this.showAll, this.showVideoOnly, new SelectPhotoUtil.DirectorCallback() { // from class: com.sankuai.titans.widget.media.fragment.MediaPickerFragment.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.widget.media.utils.SelectPhotoUtil.DirectorCallback
                public void onDirectorResult(List<PhotoDirectory> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "58f84c203a8d12b6579269b2a2bdf664", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "58f84c203a8d12b6579269b2a2bdf664");
                    } else if (MediaPickerFragment.this.getActivity() != null && !MediaPickerFragment.this.getActivity().isDestroyed() && !MediaPickerFragment.this.getActivity().isFinishing()) {
                        if (list != null) {
                            MediaPickerFragment.this.directories.clear();
                            MediaPickerFragment.this.directories.addAll(list);
                            MediaPickerFragment.this.directoryHashMap = new HashMap();
                            for (PhotoDirectory photoDirectory : MediaPickerFragment.this.directories) {
                                MediaPickerFragment.this.directoryHashMap.put(photoDirectory.getId(), photoDirectory);
                            }
                            MediaPickerFragment.this.getPhoto(MediaPickerFragment.this.mCurrentPage, MediaPickerFragment.this.directoryHashMap);
                        }
                        MediaPickerFragment.this.updateShowPhotoDirectory(0);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getPhoto(final int i, final Map<String, PhotoDirectory> map) {
        Object[] objArr = {Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b03886afdf40ff70897b850245d5cf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b03886afdf40ff70897b850245d5cf2");
        } else {
            SelectPhotoUtil.getPhoto(getContext(), SelectPhotoUtil.ALL_ID, this.showAll, this.showVideoOnly, this.showGif, i, this.maxDuration, this.minDuration, this.maxFileSize, this.excludeExtName, this.includeExtName, this.accessToken, new SelectPhotoUtil.PhotoCallback() { // from class: com.sankuai.titans.widget.media.fragment.MediaPickerFragment.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.widget.media.utils.SelectPhotoUtil.PhotoCallback
                public void onPhotoResult(List<Photo> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e974d9561af3e56c4001ad6f32db7204", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e974d9561af3e56c4001ad6f32db7204");
                    } else if (MediaPickerFragment.this.getActivity() != null && !MediaPickerFragment.this.getActivity().isDestroyed() && !MediaPickerFragment.this.getActivity().isFinishing() && list != null && list.size() != 0) {
                        for (Photo photo : list) {
                            if (photo != null) {
                                PhotoDirectory photoDirectory = (PhotoDirectory) map.get(photo.getDirectId());
                                if (photoDirectory != null) {
                                    photoDirectory.addPhoto(photo);
                                }
                                PhotoDirectory photoDirectory2 = (PhotoDirectory) map.get(SelectPhotoUtil.ALL_ID);
                                if (photoDirectory2 != null) {
                                    photoDirectory2.addPhoto(photo);
                                }
                            }
                        }
                        MediaPickerFragment.this.photoGridAdapter.notifyDataChangedByPage(i);
                    }
                }
            });
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "896ff0be1d8b21971fe76901c387b611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "896ff0be1d8b21971fe76901c387b611");
            return;
        }
        super.onResume();
        if (getActivity() instanceof MediaActivity) {
            MediaActivity mediaActivity = (MediaActivity) getActivity();
            mediaActivity.updateTitleDoneItem();
            mediaActivity.resumeViewData();
        }
    }

    private void initFullSizeButton(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd77c6bc4ee339b71a1a1f89dd7be150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd77c6bc4ee339b71a1a1f89dd7be150");
            return;
        }
        int i = getArguments().getInt(PickerBuilder.EXTRA_MEDIA_SIZE, 3);
        View findViewById = view.findViewById(R.id.fullSize);
        if (i == 3) {
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.widget.media.fragment.MediaPickerFragment.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e67bba0909b645d5e1c71c18aa52d1f9", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e67bba0909b645d5e1c71c18aa52d1f9");
                        return;
                    }
                    view2.setSelected(true ^ view2.isSelected());
                    MediaPickerFragment.this.updateMediaSize(view2);
                }
            });
        } else if (i == 1) {
            findViewById.setVisibility(8);
            findViewById.setSelected(true);
            updateMediaSize(findViewById);
        } else if (i == 2) {
            findViewById.setVisibility(8);
            findViewById.setSelected(false);
            updateMediaSize(findViewById);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMediaSize(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9cfeef2aa2585981eb5d93234ff109e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9cfeef2aa2585981eb5d93234ff109e");
        } else if (getActivity() instanceof MediaActivity) {
            ((MediaActivity) getActivity()).updateOutputMediaSize(!view.isSelected());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void previewVideo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf5628d9344c3c9a9c69199a3d295776", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf5628d9344c3c9a9c69199a3d295776");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setDataAndType(Uri.parse(str), "video/mp4");
            startActivity(intent);
        } catch (Exception unused) {
            SnackbarUtil.showSnackbar(getActivity(), "no video player");
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af41797f5ce82b6f3ba9f3b9aae8c5ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af41797f5ce82b6f3ba9f3b9aae8c5ab");
        }
        View inflate = layoutInflater.inflate(R.layout.titans_picker_fragment_photo_picker, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_photos);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(this.column, 1);
        staggeredGridLayoutManager.setGapStrategy(2);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(this.photoGridAdapter);
        recyclerView.setItemAnimator(new v());
        initFullSizeButton(inflate);
        this.btSwitchDirectory = (Button) inflate.findViewById(R.id.button);
        if (this.showAll) {
            this.btSwitchDirectory.setText(R.string.__picker_all_image_and_video);
        } else if (this.showVideoOnly) {
            this.btSwitchDirectory.setText(R.string.__picker_all_video);
        }
        if (this.photoGridAdapter != null && this.photoGridAdapter.currentDirectoryIndex != 0 && this.directories != null) {
            this.btSwitchDirectory.setText(this.directories.get(this.photoGridAdapter.currentDirectoryIndex).getName());
        }
        this.photoGridAdapter.setOnItemCheckListener(this.itemCheckListener);
        this.photoGridAdapter.setOnPhotoClickListener(new OnPhotoClickListener() { // from class: com.sankuai.titans.widget.media.fragment.MediaPickerFragment.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.widget.media.event.OnPhotoClickListener
            public void onClick(View view, int i, boolean z) {
                Object[] objArr2 = {view, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c10a71941fe79f11a99bb4bc6e18ffe0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c10a71941fe79f11a99bb4bc6e18ffe0");
                    return;
                }
                if (z) {
                    i--;
                }
                if (MediaPickerFragment.this.showAll) {
                    List<Photo> currentPhotos = MediaPickerFragment.this.photoGridAdapter.getCurrentPhotos();
                    if (currentPhotos == null || currentPhotos.size() <= i) {
                        return;
                    }
                    if (currentPhotos.get(i).getMediaType() == 2) {
                        MediaPickerFragment.this.previewVideo(MediaPickerFragment.this.photoGridAdapter.getCurrentPhotoPaths().get(i));
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int size = currentPhotos.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        if (i3 == i) {
                            i2 = arrayList.size();
                        }
                        Photo photo = currentPhotos.get(i3);
                        if (photo.getMediaType() == 1) {
                            arrayList.add(photo.getPath());
                        }
                    }
                    MediaStoreHelper.setPhotoPaths(arrayList);
                    ((MediaActivity) MediaPickerFragment.this.getActivity()).addImagePagerFragment(MediaPlayerFragment.pickNewInstance(i2));
                } else if (MediaPickerFragment.this.showVideoOnly) {
                    MediaPickerFragment.this.previewVideo(MediaPickerFragment.this.photoGridAdapter.getCurrentPhotoPaths().get(i));
                } else {
                    MediaStoreHelper.setPhotoPaths(MediaPickerFragment.this.photoGridAdapter.getCurrentPhotoPaths());
                    ((MediaActivity) MediaPickerFragment.this.getActivity()).addImagePagerFragment(MediaPlayerFragment.pickNewInstance(i));
                }
            }
        });
        this.photoGridAdapter.setOnCameraClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.widget.media.fragment.MediaPickerFragment.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "014e56b7cfea0cd98a00e402a30d0856", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "014e56b7cfea0cd98a00e402a30d0856");
                    return;
                }
                int size = MediaPickerFragment.this.getPhotoGridAdapter().getSelectedPhotos() != null ? MediaPickerFragment.this.getPhotoGridAdapter().getSelectedPhotos().size() : 0;
                if (MediaPickerFragment.this.maxCount != 1 && size >= MediaPickerFragment.this.maxCount) {
                    String string = MediaPickerFragment.this.getArguments().getString(PickerBuilder.EXTRA_MAX_COUNT_HINT);
                    SnackbarUtil.showSnackbar(MediaPickerFragment.this.getActivity(), (TextUtils.isEmpty(string) || !string.contains("%d")) ? MediaPickerFragment.this.getString(R.string.__picker_over_max_count_tips, Integer.valueOf(MediaPickerFragment.this.maxCount)) : String.format(string, Integer.valueOf(MediaPickerFragment.this.maxCount)));
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(PermissionGuard.PERMISSION_CAMERA);
                arrayList.add(PermissionGuard.PERMISSION_STORAGE);
                TitansPermissionUtil.requestPermissions(MediaPickerFragment.this.getActivity(), arrayList, MediaPickerFragment.this.accessToken, new IRequestPermissionCallback() { // from class: com.sankuai.titans.widget.media.fragment.MediaPickerFragment.5.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.result.IRequestPermissionCallback
                    public void onResult(boolean z, int i) {
                        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "dab26de5686647d510cbb9f98253980b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "dab26de5686647d510cbb9f98253980b");
                        } else if (z) {
                            MediaPickerFragment.this.openCamera();
                        } else {
                            SnackbarUtil.showSnackbar(MediaPickerFragment.this.getActivity(), "没有相机或者磁盘读写权限");
                        }
                    }
                });
            }
        });
        recyclerView.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.titans.widget.media.fragment.MediaPickerFragment.6
            public static ChangeQuickRedirect changeQuickRedirect;
            private int lastCompletelyVisibleItemPosition;
            private int[] lastCompletelyVisiblePositions;

            private int getMaxPosition(int[] iArr) {
                Object[] objArr2 = {iArr};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fba8fb0da0d2ed22438cff86f5f4c57e", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fba8fb0da0d2ed22438cff86f5f4c57e")).intValue();
                }
                int i = iArr[0];
                for (int i2 = 1; i2 < iArr.length; i2++) {
                    if (iArr[i2] > i) {
                        i = iArr[i2];
                    }
                }
                return i;
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                Object[] objArr2 = {recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1961aa5be340da0f09fdb7592f1b4c9e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1961aa5be340da0f09fdb7592f1b4c9e");
                    return;
                }
                super.onScrolled(recyclerView2, i, i2);
                if (Math.abs(i2) > 30) {
                    Picasso unused = MediaPickerFragment.this.mGlideRequestManager;
                    Picasso unused2 = MediaPickerFragment.this.mGlideRequestManager;
                } else {
                    MediaPickerFragment.this.resumeRequestsIfNotDestroyed();
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) recyclerView2.getLayoutManager();
                if (this.lastCompletelyVisiblePositions == null) {
                    this.lastCompletelyVisiblePositions = new int[staggeredGridLayoutManager2.getSpanCount()];
                }
                staggeredGridLayoutManager2.findLastCompletelyVisibleItemPositions(this.lastCompletelyVisiblePositions);
                this.lastCompletelyVisibleItemPosition = getMaxPosition(this.lastCompletelyVisiblePositions);
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                Object[] objArr2 = {recyclerView2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bf9285e643ffa7f609b71cff89a810d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bf9285e643ffa7f609b71cff89a810d5");
                    return;
                }
                if (i == 0) {
                    MediaPickerFragment.this.resumeRequestsIfNotDestroyed();
                }
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int itemCount = layoutManager.getItemCount();
                if (i != 0 || childCount <= 0 || this.lastCompletelyVisibleItemPosition < itemCount - 1) {
                    return;
                }
                MediaPickerFragment.this.loadMore();
            }
        });
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShowPhotoDirectory(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0548beece9fc6840d4a2fbc86daa3fb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0548beece9fc6840d4a2fbc86daa3fb5");
        } else if (this.directories == null || this.directories.size() == 0) {
        } else {
            this.btSwitchDirectory.setText(this.directories.get(i).getName());
            this.photoGridAdapter.setCurrentDirectoryIndex(i);
            this.photoGridAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openCamera() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04019fb742ee6b865c4dcee4fda5a7a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04019fb742ee6b865c4dcee4fda5a7a6");
            return;
        }
        File file = null;
        try {
            if (!TextUtils.isEmpty(this.resultFilePath) && (getPhotoGridAdapter().getSelectedPhotos() == null || !getPhotoGridAdapter().getSelectedPhotos().contains(this.resultFilePath))) {
                file = new File(this.resultFilePath);
            }
            File file2 = file;
            if (this.showVideoOnly) {
                TitansPictureUtil.takeVideo(getActivity(), 2, this.accessToken, file2, getArguments().getInt(PickerBuilder.EXTRA_MEDIA_SIZE, 3) != 1 ? 0 : 1, getArguments().getInt(PickerBuilder.EXTRA_VIDEO_MAX_DURATION, -1), new IPictureResultCallback() { // from class: com.sankuai.titans.widget.media.fragment.MediaPickerFragment.7
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.result.IPictureResultCallback
                    public void onCancel() {
                    }

                    @Override // com.sankuai.titans.result.IPictureResultCallback
                    public void onResult(String str) {
                        Object[] objArr2 = {str};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "03ff6e73612ddd88c9281b277f469948", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "03ff6e73612ddd88c9281b277f469948");
                        } else if (TextUtils.isEmpty(str)) {
                        } else {
                            if (MediaPickerFragment.this.captureManager == null) {
                                MediaPickerFragment.this.captureManager = new ImageCaptureManager(MediaPickerFragment.this.getActivity());
                            }
                            MediaPickerFragment.this.captureManager.galleryAddPic(str);
                            SelectPhotoUtil.getTakePhoto(MediaPickerFragment.this.getActivity(), str, MediaPickerFragment.this.accessToken, true, new SelectPhotoUtil.PhotoCallback() { // from class: com.sankuai.titans.widget.media.fragment.MediaPickerFragment.7.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.sankuai.titans.widget.media.utils.SelectPhotoUtil.PhotoCallback
                                public void onPhotoResult(List<Photo> list) {
                                    Object[] objArr3 = {list};
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2f92433e621b54e6fd31a209e712c09b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2f92433e621b54e6fd31a209e712c09b");
                                    } else if (list == null || list.size() == 0) {
                                    } else {
                                        PhotoDirectory photoDirectory = (PhotoDirectory) MediaPickerFragment.this.directoryHashMap.get(SelectPhotoUtil.ALL_ID);
                                        if (photoDirectory != null) {
                                            photoDirectory.addPhoto(0, list.get(0));
                                        }
                                        if (MediaPickerFragment.this.photoGridAdapter != null) {
                                            List<String> selectedPhotos = MediaPickerFragment.this.photoGridAdapter.getSelectedPhotos();
                                            if (selectedPhotos != null) {
                                                selectedPhotos.clear();
                                                selectedPhotos.add(list.get(0).getPath());
                                            }
                                            MediaPickerFragment.this.photoGridAdapter.notifyDataSetChanged();
                                            if (MediaPickerFragment.this.getActivity() instanceof MediaActivity) {
                                                ((MediaActivity) MediaPickerFragment.this.getActivity()).updateTitleDoneItem();
                                            }
                                        }
                                    }
                                }
                            });
                        }
                    }
                });
                return;
            }
            TitansPictureUtil.takePhoto(getActivity(), 1, this.accessToken, file2, new IPictureResultCallback() { // from class: com.sankuai.titans.widget.media.fragment.MediaPickerFragment.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IPictureResultCallback
                public void onCancel() {
                }

                @Override // com.sankuai.titans.result.IPictureResultCallback
                public void onResult(final String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "65bb19608d61d4bfbf50b605765eab88", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "65bb19608d61d4bfbf50b605765eab88");
                    } else if (TextUtils.isEmpty(str)) {
                    } else {
                        if (MediaPickerFragment.this.captureManager == null) {
                            MediaPickerFragment.this.captureManager = new ImageCaptureManager(MediaPickerFragment.this.getActivity());
                        }
                        MediaPickerFragment.this.captureManager.galleryAddPic(str);
                        SelectPhotoUtil.getTakePhoto(MediaPickerFragment.this.getContext(), str, MediaPickerFragment.this.accessToken, false, new SelectPhotoUtil.PhotoCallback() { // from class: com.sankuai.titans.widget.media.fragment.MediaPickerFragment.8.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.sankuai.titans.widget.media.utils.SelectPhotoUtil.PhotoCallback
                            public void onPhotoResult(List<Photo> list) {
                                PhotoDirectory photoDirectory;
                                Object[] objArr3 = {list};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "de4741efa4b953b2477fa80fb4f3db68", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "de4741efa4b953b2477fa80fb4f3db68");
                                    return;
                                }
                                for (Photo photo : list) {
                                    if (photo != null && (photoDirectory = (PhotoDirectory) MediaPickerFragment.this.directoryHashMap.get(SelectPhotoUtil.ALL_ID)) != null) {
                                        photoDirectory.addPhoto(0, photo);
                                    }
                                }
                                if (MediaPickerFragment.this.photoGridAdapter != null) {
                                    List<String> selectedPhotos = MediaPickerFragment.this.photoGridAdapter.getSelectedPhotos();
                                    if (selectedPhotos != null) {
                                        if (MediaPickerFragment.this.maxCount == 1) {
                                            selectedPhotos.clear();
                                        }
                                        selectedPhotos.add(str);
                                    }
                                    MediaPickerFragment.this.photoGridAdapter.notifyDataSetChanged();
                                    if (MediaPickerFragment.this.getActivity() instanceof MediaActivity) {
                                        ((MediaActivity) MediaPickerFragment.this.getActivity()).updateTitleDoneItem();
                                    }
                                }
                            }
                        });
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setResultIntent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "886361008058df3d189467b805725ecf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "886361008058df3d189467b805725ecf");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(PickerBuilder.KEY_SELECTED_PHOTOS, new ArrayList<>(getPhotoGridAdapter().getSelectedPhotoPaths()));
        if (getActivity() instanceof MediaActivity) {
            ((MediaActivity) getActivity()).invokeFinishCallback(-1, bundle);
        }
    }

    public PhotoGridAdapter getPhotoGridAdapter() {
        return this.photoGridAdapter;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ff4803de6fdb37814ab21ef92dd7e02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ff4803de6fdb37814ab21ef92dd7e02");
            return;
        }
        super.onDestroy();
        if (this.directories == null) {
            return;
        }
        for (PhotoDirectory photoDirectory : this.directories) {
            photoDirectory.getPhotoPaths().clear();
            photoDirectory.getPhotos().clear();
            photoDirectory.setPhotos(null);
        }
        this.directories.clear();
        this.directories = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeRequestsIfNotDestroyed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0543e009c0fe9ca3da34ba15e7030e0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0543e009c0fe9ca3da34ba15e7030e0f");
        } else if (AndroidLifecycleUtils.canLoadImage(this)) {
        }
    }

    public void setOnItemCheckListener(OnItemCheckListener onItemCheckListener) {
        Object[] objArr = {onItemCheckListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d7279a71da58f975a6486b4cc673d62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d7279a71da58f975a6486b4cc673d62");
            return;
        }
        this.itemCheckListener = onItemCheckListener;
        if (this.photoGridAdapter != null) {
            this.photoGridAdapter.setOnItemCheckListener(this.itemCheckListener);
        }
    }
}
