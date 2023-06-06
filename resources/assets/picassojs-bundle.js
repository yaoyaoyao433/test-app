'use strict';

Object.defineProperty(exports, '__esModule', { value: true });

function handleMessages(args, level) {
    var str = 'undefined';
    if (args && args.length) {
        str = args.map(function (msg) { return typeof msg === 'object' ? JSON.stringify(msg) : msg + ''; }).join(' ');
    }
    picassoLog(str, level);
}
function pLogInfo() {
    var args = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        args[_i] = arguments[_i];
    }
    if (PCSEnvironment.isDebug === false) {
        return;
    }
    handleMessages(args, 2);
}
function pLogWarning() {
    var args = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        args[_i] = arguments[_i];
    }
    handleMessages(args, 1);
}
function pLogError() {
    var args = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        args[_i] = arguments[_i];
    }
    handleMessages(args, 0);
}

function isValidString(str) {
    return typeof str === "string" && str.length > 0;
}
function isEmptyObject(obj) {
    return obj && typeof obj === "object" && Object.keys(obj).length === 0;
}

var CurrentVC;
var SharedData = new Map();
function currentHostId() {
    return CurrentVC ? CurrentVC.hostId : "";
}
function getCurrentVC() {
    return CurrentVC;
}
function setCurrentVC(vc) {
    CurrentVC = vc;
}
function setViewAction(viewId, action, callback) {
    if (CurrentVC) {
        CurrentVC.setViewAction(viewId, action, callback);
    }
}
function infoHandler(v) {
    if (CurrentVC) {
        return CurrentVC.infoFilter(v);
    }
}
function innerExecuteViewCommandSet(hostId, viewId, commandSet) {
    if (hostId && hostId.length > 0 && viewId && viewId.length > 0 && commandSet) {
        nativeCommandViewDirectly(hostId, [viewId], [commandSet]);
    }
}
function setSharedData(key, value) {
    SharedData.set(key, value);
}
function getSharedData(key) {
    return SharedData.get(key);
}
function deleteSharedData(key) {
    if (SharedData.has(key)) {
        return SharedData.delete(key);
    }
    return false;
}
function addNeedSizeToFitView(view) {
    if (CurrentVC) {
        CurrentVC.addNeedSizeToFitView(view);
    }
}
function getVCKeyCache(key) {
    if (key && CurrentVC) {
        return CurrentVC.getKeyCache().getCachedByKey(key);
    }
    return undefined;
}
function sizeForKey(theKey) {
    if (CurrentVC && CurrentVC.getSizeCache()) {
        return CurrentVC.getSizeCache()[theKey];
    }
    else {
        pLogError('Please call sizeToFit during layout');
        return undefined;
    }
}
function isViewStable() {
    if (CurrentVC) {
        return CurrentVC.isViewStable();
    }
    return true;
}
function needTwiceRender(view) {
    if (CurrentVC) {
        CurrentVC.needTwiceRender(view);
    }
}
function partRenderEnabled() {
    if (CurrentVC) {
        return CurrentVC.shouldPartRender();
    }
    return false;
}
function execViewCommandSet(viewId, commandSet) {
    if (CurrentVC) {
        CurrentVC.innerCommandView(viewId, commandSet);
    }
}
function execViewCommand(viewId, command, param) {
    if (CurrentVC) {
        CurrentVC.innerCommandView(viewId, (_a = {}, _a[command] = (param ? param : {}), _a));
    }
    var _a;
}

var Increment_View_Id = 0;
function _generateViewId() {
    Increment_View_Id = Increment_View_Id + 1;
    return ("viewid-" + Increment_View_Id);
}
(function (GradientOrientation) {
    GradientOrientation[GradientOrientation["TOP_BOTTOM"] = 0] = "TOP_BOTTOM";
    GradientOrientation[GradientOrientation["TR_BL"] = 1] = "TR_BL";
    GradientOrientation[GradientOrientation["RIGHT_LEFT"] = 2] = "RIGHT_LEFT";
    GradientOrientation[GradientOrientation["BR_TL"] = 3] = "BR_TL";
    GradientOrientation[GradientOrientation["BOTTOM_TOP"] = 4] = "BOTTOM_TOP";
    GradientOrientation[GradientOrientation["BL_TR"] = 5] = "BL_TR";
    GradientOrientation[GradientOrientation["LEFT_RIGHT"] = 6] = "LEFT_RIGHT";
    GradientOrientation[GradientOrientation["TL_BR"] = 7] = "TL_BR";
})(exports.GradientOrientation || (exports.GradientOrientation = {}));
var CommandBaseView = (function () {
    function CommandBaseView() {
    }
    Object.defineProperty(CommandBaseView.prototype, "viewId", {
        get: function () {
            return this._viewId;
        },
        enumerable: true,
        configurable: true
    });
    CommandBaseView.prototype.command = function (cmds) {
        this.execViewCommandSet(cmds);
    };
    CommandBaseView.prototype.execViewCommandSet = function (cmds) {
        innerExecuteViewCommandSet(this._hostId, this._viewId, cmds);
    };
    CommandBaseView.prototype.execViewCommand = function (command, param) {
        innerExecuteViewCommandSet(this._hostId, this._viewId, (_a = {}, _a[command] = (param ? param : {}), _a));
        var _a;
    };
    return CommandBaseView;
}());
var FlexWrap;
(function (FlexWrap) {
    FlexWrap[FlexWrap["nowrap"] = 0] = "nowrap";
    FlexWrap[FlexWrap["wrap"] = 1] = "wrap";
    FlexWrap[FlexWrap["wrap-reverse"] = 2] = "wrap-reverse";
})(FlexWrap || (FlexWrap = {}));
var Direction;
(function (Direction) {
    Direction[Direction["inherit"] = 0] = "inherit";
    Direction[Direction["ltr"] = 1] = "ltr";
    Direction[Direction["rtl"] = 2] = "rtl";
})(Direction || (Direction = {}));
var FlexDirection;
(function (FlexDirection) {
    FlexDirection[FlexDirection["column"] = 0] = "column";
    FlexDirection[FlexDirection["column-reverse"] = 1] = "column-reverse";
    FlexDirection[FlexDirection["row"] = 2] = "row";
    FlexDirection[FlexDirection["row-reverse"] = 3] = "row-reverse";
})(FlexDirection || (FlexDirection = {}));
var Orientation;
(function (Orientation) {
    Orientation[Orientation["vertical"] = 0] = "vertical";
    Orientation[Orientation["horizontal"] = 2] = "horizontal";
})(Orientation || (Orientation = {}));
var JustifyContent;
(function (JustifyContent) {
    JustifyContent[JustifyContent["start"] = 0] = "start";
    JustifyContent[JustifyContent["center"] = 1] = "center";
    JustifyContent[JustifyContent["end"] = 2] = "end";
    JustifyContent[JustifyContent["space-between"] = 3] = "space-between";
    JustifyContent[JustifyContent["space-around"] = 4] = "space-around";
    JustifyContent[JustifyContent["space-evenly"] = 5] = "space-evenly";
})(JustifyContent || (JustifyContent = {}));
var AlignItems;
(function (AlignItems) {
    AlignItems[AlignItems["start"] = 1] = "start";
    AlignItems[AlignItems["center"] = 2] = "center";
    AlignItems[AlignItems["end"] = 3] = "end";
    AlignItems[AlignItems["stretch"] = 4] = "stretch";
    AlignItems[AlignItems["baseline"] = 5] = "baseline";
})(AlignItems || (AlignItems = {}));
var AlignSelf;
(function (AlignSelf) {
    AlignSelf[AlignSelf["auto"] = 0] = "auto";
    AlignSelf[AlignSelf["start"] = 1] = "start";
    AlignSelf[AlignSelf["center"] = 2] = "center";
    AlignSelf[AlignSelf["end"] = 3] = "end";
    AlignSelf[AlignSelf["stretch"] = 4] = "stretch";
    AlignSelf[AlignSelf["baseline"] = 5] = "baseline";
})(AlignSelf || (AlignSelf = {}));
var AlignContent;
(function (AlignContent) {
    AlignContent[AlignContent["start"] = 1] = "start";
    AlignContent[AlignContent["center"] = 2] = "center";
    AlignContent[AlignContent["end"] = 3] = "end";
    AlignContent[AlignContent["stretch"] = 4] = "stretch";
    AlignContent[AlignContent["space-between"] = 6] = "space-between";
    AlignContent[AlignContent["space-around"] = 7] = "space-around";
})(AlignContent || (AlignContent = {}));
var PositionType;
(function (PositionType) {
    PositionType[PositionType["relative"] = 0] = "relative";
    PositionType[PositionType["absolute"] = 1] = "absolute";
})(PositionType || (PositionType = {}));
var BaseView = (function () {
    function BaseView() {
        this._x = 0;
        this._y = 0;
        this._width = 0;
        this._height = 0;
        this.type = -1;
        this.borderWidth = 0;
        this.borderColor = "";
        this.alpha = 1;
        this.hidden = false;
        this.shadowColor = "";
        this.shadowOpacity = 0;
        this.shadowRadius = 3;
        this.shadowOffset = { width: 0, height: -3 };
        this.gaLabel = "";
        this.gaUserInfo = {};
        this.statisticsInfo = {};
        this.ignoreBaselineAdjustment = false;
        this.isRootFlexView = false;
        this.shrinkable = false;
        this.viewId = _generateViewId();
        this.parentId = "";
        this.hostId = currentHostId();
        this.actions = {};
        this.tag = "";
        this.accessId = "";
        this.accessLabel = "";
        this.componentId = 0;
        this.componentIntercept = false;
    }
    BaseView.prototype.bindCommandView = function (cmdView) {
        cmdView._viewId = this.viewId;
        cmdView._hostId = this.hostId;
    };
    Object.defineProperty(BaseView.prototype, "commandRef", {
        get: function () {
            var cmdView = new CommandBaseView;
            this.bindCommandView(cmdView);
            return cmdView;
        },
        enumerable: true,
        configurable: true
    });
    BaseView.viewWithFrame = function (x, y, width, height) {
        var v = new this();
        v._x = x;
        v._y = y;
        v._width = width;
        v._height = height;
        return v;
    };
    BaseView.viewWithSize = function (width, height) {
        return this.viewWithFrame(0, 0, width, height);
    };
    Object.defineProperty(BaseView.prototype, "x", {
        get: function () {
            return (typeof this._x === "number") ? this._x : 0;
        },
        set: function (v) {
            this._x = v;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BaseView.prototype, "y", {
        get: function () {
            return (typeof this._y === "number") ? this._y : 0;
        },
        set: function (v) {
            this._y = v;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BaseView.prototype, "width", {
        get: function () {
            if (typeof this._width !== "number" || this._width < 0) {
                pLogError("您的代码中某个View的width设置错误。请检查代码中width类型是否正确，值是否大于等于0");
                return 0;
            }
            return this._width;
        },
        set: function (v) {
            this._width = v;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BaseView.prototype, "height", {
        get: function () {
            if (typeof this._height !== "number" || this._height < 0) {
                pLogError("您的代码中某个View的height设置错误。请检查代码中height类型是否正确，值是否大于等于0");
                return 0;
            }
            return this._height;
        },
        set: function (v) {
            this._height = v;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BaseView.prototype, "left", {
        get: function () {
            return this.x;
        },
        set: function (v) {
            this.x = v;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BaseView.prototype, "right", {
        get: function () {
            return this.x + this.width;
        },
        set: function (v) {
            this.x = v - this.width;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BaseView.prototype, "top", {
        get: function () {
            return this.y;
        },
        set: function (v) {
            this.y = v;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BaseView.prototype, "bottom", {
        get: function () {
            return this.y + this.height;
        },
        set: function (v) {
            this.y = v - this.height;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BaseView.prototype, "center", {
        get: function () {
            return {
                x: this.centerX,
                y: this.centerY
            };
        },
        set: function (center) {
            this.centerX = center.x;
            this.centerY = center.y;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BaseView.prototype, "centerX", {
        get: function () {
            return this.x + this.width / 2;
        },
        set: function (v) {
            this.x = v - this.width / 2;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BaseView.prototype, "centerY", {
        get: function () {
            return this.y + this.height / 2;
        },
        set: function (v) {
            this.y = v - this.height / 2;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BaseView.prototype, "size", {
        get: function () {
            return {
                width: this.width,
                height: this.height
            };
        },
        set: function (v) {
            this.width = v.width;
            this.height = v.height;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BaseView.prototype, "frame", {
        get: function () {
            return {
                x: this.x,
                y: this.y,
                width: this.width,
                height: this.height
            };
        },
        set: function (v) {
            this.x = v.x;
            this.y = v.y;
            this.width = v.width;
            this.height = v.height;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BaseView.prototype, "bounds", {
        get: function () {
            return {
                x: 0,
                y: 0,
                width: this.width,
                height: this.height
            };
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(BaseView.prototype, "baseline", {
        get: function () {
            return this.bottom;
        },
        set: function (v) {
            this.bottom = v;
        },
        enumerable: true,
        configurable: true
    });
    BaseView.prototype.setAction = function (action, callback) {
        setViewAction(this.viewId, action, callback);
        this.actions[action] = callback;
    };
    BaseView.prototype.getAction = function (action) {
        return this.actions[action];
    };
    BaseView.prototype.info = function () {
        var info = {
            x: this.x,
            y: this.y,
            width: this.width,
            height: this.height,
            type: this.type,
            viewId: this.viewId,
            parentId: this.parentId,
            hostId: this.hostId,
            actions: Object.keys(this.actions),
        };
        if (this.componentId > 0)
            info.componentId = this.componentId;
        if (this.componentIntercept === true)
            info.componentIntercept = true;
        if (this.borderWidth)
            info.borderWidth = this.borderWidth;
        if (isValidString(this.borderColor))
            info.borderColor = this.borderColor;
        if (this.alpha < 1)
            info.alpha = this.alpha;
        if (this.hidden === true)
            info.hidden = true;
        if (isValidString(this.shadowColor))
            info.sdColor = this.shadowColor;
        if (this.shadowOffset.width !== 0)
            info.sdOffsetX = this.shadowOffset.width;
        if (this.shadowOffset.height !== -3)
            info.sdOffsetY = this.shadowOffset.height;
        if (this.shadowOpacity > 0)
            info.sdOpacity = this.shadowOpacity;
        if (this.shadowRadius !== 3)
            info.sdRadius = this.shadowRadius;
        if (isValidString(this.gaLabel))
            info.gaLabel = this.gaLabel;
        if (!isEmptyObject(this.gaUserInfo)) {
            if (typeof this.gaUserInfo === "object") {
                info.gaUserInfo = PCSEnvironment.platform === "iOS" ? this.gaUserInfo : JSON.stringify(this.gaUserInfo);
            }
            else {
                info.gaUserInfo = this.gaUserInfo;
            }
        }
        if (!isEmptyObject(this.statisticsInfo))
            info.statisticsInfo = PCSEnvironment.platform === "iOS" ? this.statisticsInfo : JSON.stringify(this.statisticsInfo);
        if (isValidString(this.tag))
            info.tag = this.tag;
        if (this.extra) {
            if (typeof this.extra === "object") {
                info.extra = PCSEnvironment.platform === "iOS" ? this.extra : JSON.stringify(this.extra);
            }
            else {
                info.extra = this.extra;
            }
        }
        if (isValidString(this.accessId))
            info.accessId = this.accessId;
        if (isValidString(this.accessLabel))
            info.accessLabel = this.accessLabel;
        if (this.backgroundColor && typeof this.backgroundColor === "object") {
            info.startColor = this.backgroundColor.startColor;
            info.endColor = this.backgroundColor.endColor;
            info.orientation = this.backgroundColor.orientation;
        }
        else if (typeof this.backgroundColor === "string" && this.backgroundColor.length > 0) {
            info.backgroundColor = this.backgroundColor;
        }
        if (typeof this.cornerRadius === "object") {
            info.cornerRadiusLT = this.cornerRadius.leftTop;
            info.cornerRadiusRT = this.cornerRadius.rightTop;
            info.cornerRadiusLB = this.cornerRadius.leftBottom;
            info.cornerRadiusRB = this.cornerRadius.rightBottom;
            info.cornerRadius = this.cornerRadius.radius;
        }
        else if (this.cornerRadius > 0) {
            info.cornerRadius = this.cornerRadius;
        }
        if (this.isRootFlexView === true)
            info.isRootFlexView = true;
        if (this.flexStyle) {
            info.flexStyle = this.convertFlexStyle(this.flexStyle);
        }
        return info;
    };
    BaseView.prototype.convertFlexStyle = function (style) {
        var flexStyle = Object();
        if (style.direction) {
            if (typeof style.direction === 'number') {
                flexStyle.direction = style.direction;
            }
            else if (Direction[style.direction] !== undefined) {
                flexStyle.direction = Direction[style.direction];
            }
        }
        if (style.flexDirection) {
            if (typeof style.flexDirection === 'number') {
                flexStyle.flexDirection = style.flexDirection;
            }
            else if (FlexDirection[style.flexDirection] !== undefined) {
                flexStyle.flexDirection = FlexDirection[style.flexDirection];
            }
        }
        if (style.orientation && typeof style.orientation === 'string' && Orientation[style.orientation] !== undefined) {
            flexStyle.flexDirection = Orientation[style.orientation];
        }
        if (style.justifyContent) {
            if (typeof style.justifyContent === 'number') {
                flexStyle.justifyContent = style.justifyContent;
            }
            else if (JustifyContent[style.justifyContent] !== undefined) {
                flexStyle.justifyContent = JustifyContent[style.justifyContent];
            }
        }
        if (style.contentAlign) {
            if (style.contentAlign === 'center') {
                flexStyle.justifyContent = 1;
            }
            if (style.contentAlign === 'top') {
                if (!flexStyle.flexDirection || flexStyle.flexDirection === 0) {
                    flexStyle.justifyContent = 0;
                }
                else if (flexStyle.flexDirection === 1) {
                    flexStyle.justifyContent = 2;
                }
            }
            if (style.contentAlign === 'bottom') {
                if (!flexStyle.flexDirection || flexStyle.flexDirection === 0) {
                    flexStyle.justifyContent = 2;
                }
                else if (flexStyle.flexDirection === 1) {
                    flexStyle.justifyContent = 0;
                }
            }
            if (style.contentAlign === 'left') {
                if (flexStyle.flexDirection === 2) {
                    flexStyle.justifyContent = 0;
                }
                else if (flexStyle.flexDirection === 3) {
                    flexStyle.justifyContent = 2;
                }
            }
            if (style.contentAlign === 'right') {
                if (flexStyle.flexDirection === 2) {
                    flexStyle.justifyContent = 2;
                }
                else if (flexStyle.flexDirection === 3) {
                    flexStyle.justifyContent = 0;
                }
            }
        }
        if (style.alignContent) {
            if (typeof style.alignContent === 'number') {
                flexStyle.alignContent = style.alignContent;
            }
            else if (AlignContent[style.alignContent] !== undefined) {
                flexStyle.alignContent = AlignContent[style.alignContent];
            }
        }
        if (style.alignItems) {
            if (typeof style.alignItems === 'number') {
                flexStyle.alignItems = style.alignItems;
            }
            else if (AlignItems[style.alignItems] !== undefined) {
                flexStyle.alignItems = AlignItems[style.alignItems];
            }
        }
        if (style.itemsAlign) {
            if (style.itemsAlign === 'center') {
                flexStyle.alignItems = 2;
            }
            if (style.itemsAlign === 'top') {
                if (flexStyle.flexDirection === 2 || flexStyle.flexDirection === 1) {
                    flexStyle.alignItems = 0;
                }
            }
            if (style.itemsAlign === 'bottom') {
                if (flexStyle.flexDirection === 2 || flexStyle.flexDirection === 1) {
                    flexStyle.alignItems = 3;
                }
            }
            if (style.itemsAlign === 'left') {
                if (!flexStyle.flexDirection || flexStyle.flexDirection === 0 || flexStyle.flexDirection === 1) {
                    flexStyle.alignItems = 0;
                }
            }
            if (style.itemsAlign === 'right') {
                if (!flexStyle.flexDirection || flexStyle.flexDirection === 0 || flexStyle.flexDirection === 1) {
                    flexStyle.alignItems = 3;
                }
            }
        }
        if (style.alignSelf) {
            if (typeof style.alignSelf === 'number') {
                flexStyle.alignSelf = style.alignSelf;
            }
            else if (AlignSelf[style.alignSelf] !== undefined) {
                flexStyle.alignSelf = AlignSelf[style.alignSelf];
            }
        }
        if (style.positionType) {
            if (typeof style.positionType === 'number') {
                flexStyle.positionType = style.positionType;
            }
            else if (PositionType[style.positionType] !== undefined) {
                flexStyle.positionType = PositionType[style.positionType];
            }
        }
        if (style.wrap) {
            if (typeof style.wrap === 'number') {
                flexStyle.wrap = style.wrap;
            }
            else if (typeof style.wrap === 'boolean') {
                flexStyle.wrap = style.wrap ? 1 : 0;
            }
        }
        if (style.flexWrap && typeof style.flexWrap === 'string' && FlexWrap[style.flexWrap] !== undefined) {
            flexStyle.wrap = FlexWrap[style.flexWrap];
        }
        if (style.flexGrow) {
            flexStyle.flexGrow = style.flexGrow;
        }
        if (style.flexShrink) {
            flexStyle.flexShrink = style.flexShrink;
        }
        if (style.flex) {
            flexStyle.flex = style.flex;
        }
        if (style.position) {
            flexStyle.position = style.position;
        }
        if (style.left || style.right || style.top || style.bottom) {
            if (!flexStyle.position) {
                flexStyle.position = {};
            }
            if (style.left) {
                flexStyle.position.left = style.left;
            }
            if (style.right) {
                flexStyle.position.right = style.right;
            }
            if (style.top) {
                flexStyle.position.top = style.top;
            }
            if (style.bottom) {
                flexStyle.position.bottom = style.bottom;
            }
        }
        if (style.margin) {
            flexStyle.margin = style.margin;
        }
        if (style.marginLeft || style.marginRight || style.marginTop || style.marginBottom) {
            if (!flexStyle.margin) {
                flexStyle.margin = {};
            }
            if (style.marginLeft) {
                flexStyle.margin.left = style.marginLeft;
            }
            if (style.marginRight) {
                flexStyle.margin.right = style.marginRight;
            }
            if (style.marginTop) {
                flexStyle.margin.top = style.marginTop;
            }
            if (style.marginBottom) {
                flexStyle.margin.bottom = style.marginBottom;
            }
        }
        if (style.padding && typeof style.padding === 'object') {
            flexStyle.padding = style.padding;
        }
        if (style.paddingLeft || style.paddingRight || style.paddingTop || style.paddingBottom
            || style.padding || style.paddingVertical || style.paddingHorizontal) {
            if (!flexStyle.padding) {
                flexStyle.padding = {};
            }
            if (style.paddingLeft) {
                flexStyle.padding.left = style.paddingLeft;
            }
            if (style.paddingRight) {
                flexStyle.padding.right = style.paddingRight;
            }
            if (style.paddingTop) {
                flexStyle.padding.top = style.paddingTop;
            }
            if (style.paddingBottom) {
                flexStyle.padding.bottom = style.paddingBottom;
            }
            if (style.padding && typeof style.padding === 'number') {
                flexStyle.padding.all = style.padding;
            }
            if (style.paddingVertical) {
                flexStyle.padding.vertical = style.paddingVertical;
            }
            if (style.paddingHorizontal) {
                flexStyle.padding.horizontal = style.paddingHorizontal;
            }
        }
        if (style.width) {
            flexStyle.width = style.width;
        }
        if (this.width > 0) {
            flexStyle.width = this.width;
        }
        if (style.height) {
            flexStyle.height = style.height;
        }
        if (this.height > 0) {
            flexStyle.height = this.height;
        }
        if (style.minWidth) {
            flexStyle.minWidth = style.minWidth;
        }
        if (style.minHeight) {
            flexStyle.minHeight = style.minHeight;
        }
        if (style.maxWidth) {
            flexStyle.maxWidth = style.maxWidth;
        }
        if (style.maxHeight) {
            flexStyle.maxHeight = style.maxHeight;
        }
        if (style.widthPercent) {
            flexStyle.widthPercent = style.widthPercent;
        }
        if (style.heightPercent) {
            flexStyle.heightPercent = style.heightPercent;
        }
        if (style.minWidthPercent) {
            flexStyle.minWidthPercent = style.minWidthPercent;
        }
        if (style.minHeightPercent) {
            flexStyle.minHeightPercent = style.minHeightPercent;
        }
        if (style.maxWidthPercent) {
            flexStyle.maxWidthPercent = style.maxWidthPercent;
        }
        if (style.maxHeightPercent) {
            flexStyle.maxHeightPercent = style.maxHeightPercent;
        }
        return flexStyle;
    };
    return BaseView;
}());

var View = (function (_super) {
    __extends(View, _super);
    function View() {
        var _this = _super.call(this) || this;
        _this.clipToBounds = true;
        _this.type = 0;
        _this.subviews = [];
        return _this;
    }
    View.prototype.addSubView = function (v) {
        this.subviews.push(v);
    };
    View.viewWithFrame = function (x, y, width, height) {
        var v = new this;
        v._x = x;
        v._y = y;
        v._width = width;
        v._height = height;
        return v;
    };
    Object.defineProperty(View.prototype, "onClick", {
        get: function () {
            return this.actions['click'];
        },
        set: function (click) {
            this.setAction('click', click);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(View.prototype, "onDoubleClick", {
        get: function () {
            return this.actions['doubleClick'];
        },
        set: function (click) {
            this.setAction('doubleClick', click);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(View.prototype, "onPan", {
        set: function (pan) {
            this.setAction('pan', pan);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(View.prototype, "onLongPress", {
        set: function (longPress) {
            this.setAction('longPress', longPress);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(View.prototype, "onPress", {
        set: function (press) {
            this.setAction('press', press);
        },
        enumerable: true,
        configurable: true
    });
    View.viewWithSize = function (width, height) {
        return this.viewWithFrame(0, 0, width, height);
    };
    View.prototype.info = function () {
        var info = _super.prototype.info.call(this);
        info.subviews = this.subviews.map(function (v) {
            return infoHandler(v);
        });
        if (this.clipToBounds === false)
            info.clipToBounds = false;
        return info;
    };
    return View;
}(BaseView));

var Button = (function (_super) {
    __extends(Button, _super);
    function Button() {
        var _this = _super.call(this) || this;
        _this.clickedColor = "";
        _this.schema = "";
        _this.type = 3;
        return _this;
    }
    Button.viewWithFrame = function (x, y, width, height) {
        var v = new this();
        v._x = x;
        v._y = y;
        v._width = width;
        v._height = height;
        return v;
    };
    Object.defineProperty(Button.prototype, "onClick", {
        get: function () {
            return this.actions['click'];
        },
        set: function (click) {
            this.setAction('click', click);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Button.prototype, "onLongPress", {
        get: function () {
            return this.actions['longPress'];
        },
        set: function (f) {
            this.setAction('longPress', f);
        },
        enumerable: true,
        configurable: true
    });
    Button.prototype.info = function () {
        var info = _super.prototype.info.call(this);
        if (isValidString(this.clickedColor))
            info.clickedColor = this.clickedColor;
        if (isValidString(this.schema))
            info.schema = this.schema;
        if (this.data)
            info.data = (typeof this.data === "object" ? (PCSEnvironment.platform === "iOS" ? this.data : JSON.stringify(this.data)) : this.data);
        return info;
    };
    return Button;
}(BaseView));

function contentModeMap(v) {
    switch (v) {
        case 'scaleToFill': return 0;
        case 'aspectFit': return 1;
        case 'aspectFill': return 2;
        case 'center': return 4;
        case 'topLeft': return 9;
        default: return v;
    }
}
function cacheMap(v) {
    switch (v) {
        case 'normal': return 0;
        case 'icon': return 1;
        default: return v;
    }
}
var ImageView = (function (_super) {
    __extends(ImageView, _super);
    function ImageView() {
        var _this = _super.call(this) || this;
        _this.imageUrl = "";
        _this.imagePath = "";
        _this.image = "";
        _this.imageBase64 = "";
        _this.contentMode = 'scaleToFill';
        _this.needPlaceholder = true;
        _this.failedRetry = false;
        _this.placeholderLoading = "";
        _this.placeholderError = "";
        _this.placeholderEmpty = "";
        _this.resizeEdgeInset = { top: 0, left: 0, bottom: 0, right: 0 };
        _this.imageScale = 3;
        _this.gifLoopCount = -1;
        _this.fadeEffect = false;
        _this.cacheType = 'normal';
        _this.blurRadius = 0;
        _this.tintColor = "";
        _this.saturation = 1.0;
        _this.businessID = "";
        _this.type = 2;
        return _this;
    }
    Object.defineProperty(ImageView.prototype, "onClick", {
        get: function () {
            return this.actions['click'];
        },
        set: function (click) {
            this.setAction('click', click);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ImageView.prototype, "onImageLoaded", {
        get: function () {
            return this.actions['imageLoaded'];
        },
        set: function (f) {
            this.setAction('imageLoaded', f);
        },
        enumerable: true,
        configurable: true
    });
    ImageView.viewWithFrame = function (x, y, width, height) {
        var v = new this;
        v._x = x;
        v._y = y;
        v._width = width;
        v._height = height;
        return v;
    };
    ImageView.prototype.info = function () {
        var info = _super.prototype.info.call(this);
        if (isValidString(this.imageUrl))
            info.imageUrl = this.imageUrl;
        if (isValidString(this.imagePath))
            info.imagePath = this.imagePath;
        if (isValidString(this.image))
            info.image = this.image;
        if (isValidString(this.imageBase64))
            info.imageBase64 = this.imageBase64;
        var contentMode = contentModeMap(this.contentMode);
        if (contentMode > 0)
            info.contentMode = contentMode;
        if (this.needPlaceholder === false)
            info.needPlaceholder = false;
        if (isValidString(this.placeholderLoading))
            info.placeholderLoading = this.placeholderLoading;
        if (isValidString(this.placeholderError))
            info.placeholderError = this.placeholderError;
        if (this.resizeEdgeInset && (this.resizeEdgeInset.left !== 0 || this.resizeEdgeInset.bottom !== 0 || this.resizeEdgeInset.right !== 0 || this.resizeEdgeInset.top !== 0))
            info.edgeInsets = this.resizeEdgeInset;
        if (this.imageScale !== 3)
            info.imageScale = this.imageScale;
        if (this.failedRetry === true)
            info.failedRetry = true;
        if (this.gifLoopCount !== -1)
            info.gifLoopCount = this.gifLoopCount;
        if (this.fadeEffect === true)
            info.fadeEffect = this.fadeEffect;
        var cacheType = cacheMap(this.cacheType);
        if (cacheType > 0)
            info.cacheType = cacheType;
        if (this.blurRadius > 0)
            info.blurRadius = this.blurRadius;
        if (this.saturation !== 1.0)
            info.saturation = this.saturation;
        if (isValidString(this.tintColor))
            info.tintColor = this.tintColor;
        if (isValidString(this.businessID))
            info.businessID = this.businessID;
        if (this.decodeOption > 0)
            info.decodeOption = this.decodeOption;
        return info;
    };
    return ImageView;
}(BaseView));

var CommandTextView = (function (_super) {
    __extends(CommandTextView, _super);
    function CommandTextView() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    CommandTextView.prototype.command = function (cmds) {
        _super.prototype.command.call(this, cmds);
    };
    return CommandTextView;
}(CommandBaseView));
function alignmentMap(v) {
    switch (v) {
        case 'left': return 0;
        case 'center': return 1;
        case 'right': return 2;
        default: return v;
    }
}
function verticalAlignmentMap(v) {
    switch (v) {
        case 'top': return 1;
        case 'center': return 0;
        case 'bottom': return 2;
        default: return v;
    }
}
function fontMap(v) {
    switch (v) {
        case 'none': return 0;
        case 'bold': return 1;
        case 'italic': return 2;
        case 'boldAndItalic': return 3;
        default: return v;
    }
}
function lineBreakMap(v) {
    switch (v) {
        case 'wordWrapping': return 0;
        case 'charWrapping': return 1;
        case 'clipping': return 2;
        case 'truncatingHead': return 3;
        case 'truncatingTail': return 4;
        case 'truncatingMiddle': return 5;
        default: return v;
    }
}
var TextView = (function (_super) {
    __extends(TextView, _super);
    function TextView() {
        var _this = _super.call(this) || this;
        _this._text = "";
        _this.textColor = "";
        _this.textSize = 14;
        _this.fontName = "";
        _this.highlightedBgColor = "";
        _this.fontStyle = 'none';
        _this.textAlignment = 'left';
        _this.contentVerticalAlignment = 'center';
        _this.lineBreakMode = 'truncatingTail';
        _this.numberOfLines = 1;
        _this.linespacing = 0;
        _this.strikethrough = false;
        _this.underline = false;
        _this.disableBold = false;
        _this.textShadowOffset = { width: 0, height: 0 };
        _this.textShadowRadius = 0;
        _this.adjustsFitWidth = false;
        _this.canShowQuickMenu = false;
        _this.type = 1;
        return _this;
    }
    Object.defineProperty(TextView.prototype, "commandRef", {
        get: function () {
            var cmdView = new CommandTextView;
            this.bindCommandView(cmdView);
            return cmdView;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(TextView.prototype, "text", {
        get: function () {
            if (this.textModel) {
                return JSON.stringify(this.textModel);
            }
            if (this._text) {
                return "" + this._text;
            }
            return "";
        },
        set: function (v) {
            if (v) {
                this._text = "" + v;
            }
            else {
                this._text = "";
            }
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(TextView.prototype, "baseline", {
        get: function () {
            return this.bottom - this.baselineBottomOffset();
        },
        set: function (v) {
            this.bottom = v + this.baselineBottomOffset();
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(TextView.prototype, "onClick", {
        get: function () {
            return this.actions['click'];
        },
        set: function (click) {
            this.setAction('click', click);
        },
        enumerable: true,
        configurable: true
    });
    TextView.viewWithFrame = function (x, y, width, height) {
        var v = new this;
        v._x = x;
        v._y = y;
        v._width = width;
        v._height = height;
        return v;
    };
    TextView.prototype.sizeToFit = function () {
        var sizeKey = this.sizeKey();
        var cacheSize = sizeForKey(sizeKey);
        if (!cacheSize) {
            this._sizeKey = sizeKey;
            addNeedSizeToFitView(this);
        }
        else {
            this.width = cacheSize.width;
            this.height = cacheSize.height;
        }
    };
    TextView.prototype.sizeToFitSync = function () {
        var size = Picasso.size_for_text(this.info());
        this.width = size.width;
        this.height = size.height;
    };
    TextView.prototype.sizeKey = function () {
        return this.text + "#" + this.numberOfLines + "#" + this.textSize + "#" + this.fontStyle + "#" + this.strikethrough + "#" + this.underline + "#" + this.linespacing + (this.numberOfLines === 1 ? "" : ("#" + this.width));
    };
    TextView.prototype.info = function () {
        var info = _super.prototype.info.call(this);
        info.text = this.text;
        if (this.textColor && typeof this.textColor === "object") {
            info.textStartColor = this.textColor.startColor;
            info.textEndColor = this.textColor.endColor;
            info.textOrientation = this.textColor.orientation;
        }
        else if (isValidString(this.textColor)) {
            info.textColor = this.textColor;
        }
        if (this.textSize !== 14)
            info.textSize = this.textSize;
        if (isValidString(this.fontName))
            info.fontName = this.fontName;
        var alignment = alignmentMap(this.textAlignment);
        if (alignment > 0)
            info.textAlignment = alignment;
        var verticalAlignment = verticalAlignmentMap(this.contentVerticalAlignment);
        if (verticalAlignment > 0)
            info.contentVerticalAlignment = verticalAlignment;
        var lineBreakMode = lineBreakMap(this.lineBreakMode);
        if (lineBreakMode !== 4)
            info.lineBreakMode = lineBreakMode;
        if (this.numberOfLines !== 1)
            info.numberOfLines = this.numberOfLines;
        var fontStyle = fontMap(this.fontStyle);
        if (fontStyle > 0)
            info.fontStyle = fontStyle;
        if (this.linespacing > 0)
            info.linespacing = this.linespacing;
        if (this.strikethrough === true)
            info.strikethrough = true;
        if (this.underline === true)
            info.underline = true;
        if (this.disableBold === true)
            info.disableBold = true;
        if (this.textShadowColor)
            info.textShadowColor = this.textShadowColor;
        if (this.textShadowRadius !== 0)
            info.textShadowRadius = this.textShadowRadius;
        if (this.textShadowOffset.width !== 0)
            info.textShadowOffsetX = this.textShadowOffset.width;
        if (this.textShadowOffset.height !== 0)
            info.textShadowOffsetY = this.textShadowOffset.height;
        if (isValidString(this.highlightedBgColor))
            info.highlightedBgColor = this.highlightedBgColor;
        if (this.adjustsFitWidth === true)
            info.adjustsFitWidth = true;
        if (this.canShowQuickMenu === true)
            info.canShowQuickMenu = true;
        if (isValidString(this._sizeKey)) {
            info.sizeKey = this._sizeKey;
            info.needSizeToFit = true;
        }
        return info;
    };
    TextView.prototype.isContainChinese = function (str) {
        for (var index = 0; index < str.length; index++) {
            var ch = str.charCodeAt(index);
            if (0x4E00 <= ch && ch <= 0x9FA5) {
                return true;
            }
        }
        return false;
    };
    TextView.prototype.getTunning = function (text, fontSize) {
        if (this.isContainChinese(text)) {
            var tunning = 0;
            if (fontSize <= 8) {
                tunning = 2;
            }
            else if (fontSize <= 23) {
                tunning = Math.floor((fontSize + 1) / 5);
            }
            else if (fontSize <= 30) {
                tunning = 6;
            }
            else if (fontSize <= 35) {
                tunning = 7;
            }
            else {
                tunning = 8;
            }
            return tunning / PCSEnvironment.scale;
        }
        return 0;
    };
    TextView.prototype.baselineBottomOffset = function () {
        if (this.numberOfLines >= 2) {
            return 0;
        }
        else {
            var maxFontSize = this.textSize;
            var allText = "";
            try {
                var textObj = JSON.parse(this.text);
                if (Array.isArray(textObj)) {
                    for (var _i = 0, textObj_1 = textObj; _i < textObj_1.length; _i++) {
                        var textDic = textObj_1[_i];
                        maxFontSize = Math.max(maxFontSize, textDic['textsize']);
                        allText += textDic['text'];
                    }
                }
                else if (textObj !== null && typeof textObj === "object") {
                    var textList = textObj["richtextlist"];
                    if (Array.isArray(textList)) {
                        for (var _a = 0, textList_1 = textList; _a < textList_1.length; _a++) {
                            var textDic = textList_1[_a];
                            maxFontSize = Math.max(maxFontSize, textDic["textsize"]);
                            allText += textDic["text"];
                        }
                    }
                    else {
                        maxFontSize = textList["textsize"];
                        allText = textList["text"];
                    }
                }
            }
            catch (e) {
                allText = this.text;
            }
            finally {
                if (allText.length === 0) {
                    allText = this.text;
                }
            }
            var bottomOffset = 0;
            bottomOffset -= this.getTunning(allText, maxFontSize);
            if (PCSEnvironment.platform === "iOS") {
                bottomOffset = (Math.floor(-PCSEnvironment.fontDescender * maxFontSize * PCSEnvironment.scale) - 1) / PCSEnvironment.scale;
                bottomOffset += (this.height - Math.ceil(maxFontSize * PCSEnvironment.fontLineHeight * PCSEnvironment.scale) / PCSEnvironment.scale) / 2;
            }
            else {
                bottomOffset += maxFontSize * PCSEnvironment.fontDescender;
            }
            return bottomOffset;
        }
    };
    return TextView;
}(BaseView));

(function (Alignment) {
    Alignment["left"] = "left";
    Alignment["right"] = "right";
    Alignment["top"] = "top";
    Alignment["bottom"] = "bottom";
    Alignment["center"] = "center";
    Alignment["baseline"] = "baseline";
})(exports.Alignment || (exports.Alignment = {}));
(function (Orientation) {
    Orientation["horizontal"] = "horizontal";
    Orientation["vertical"] = "vertical";
})(exports.Orientation || (exports.Orientation = {}));
var LayoutContainer = (function () {
    function LayoutContainer() {
        this.subviews = [];
        this.orientation = exports.Orientation.horizontal;
        this.divideSpace = 0;
        this.horizontalAlignment = exports.Alignment.left;
        this.verticalAlignment = exports.Alignment.bottom;
        this.OFFSET = 0.1;
        this.x = 0;
        this.y = 0;
        this.paddingLeft = 0;
        this.paddingRight = 0;
        this.paddingTop = 0;
        this.paddingBottom = 0;
        this.ignoreBaselineAdjustment = false;
        this.baseline = 0;
        this._width = 0;
        this._height = 0;
        this._hidden = false;
        this.shrinkable = false;
    }
    Object.defineProperty(LayoutContainer.prototype, "baselineAlignment", {
        get: function () {
            return this.orientation === exports.Orientation.horizontal && this.verticalAlignment === exports.Alignment.baseline;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(LayoutContainer.prototype, "children", {
        get: function () {
            return this.subviews.filter(function (e) { return !e.hidden; });
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(LayoutContainer.prototype, "width", {
        get: function () {
            if (this._width)
                return this._width;
            this._width = this.arrangeWidth();
            return this._width;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(LayoutContainer.prototype, "height", {
        get: function () {
            if (this._height)
                return this._height;
            this._height = this.arrangeHeight();
            return this._height;
        },
        enumerable: true,
        configurable: true
    });
    LayoutContainer.prototype.sizeToFit = function () {
        this.width;
        this.height;
    };
    LayoutContainer.prototype.arrangeHeight = function () {
        var _this = this;
        if (this.orientation === exports.Orientation.vertical) {
            return this.arrangeVertical();
        }
        else {
            return this.children.reduce(function (max, e, index) { return Math.max(max, e.height + (e.marginTop || 0) + (e.marginBottom || 0) + _this.paddingBottom + _this.paddingTop); }, 0);
        }
    };
    LayoutContainer.prototype.layout = function (adjust) {
        if (adjust)
            adjust(this);
        this.sizeToFit();
        switch (this.orientation) {
            case exports.Orientation.vertical:
                this.layoutVertical();
                break;
            case exports.Orientation.horizontal:
            default:
                this.layoutHorizontal();
                break;
        }
    };
    LayoutContainer.prototype.lastPriorityView = function () {
        var viewsWithPriority = this.children.filter(function (v) { return v.priority !== undefined; });
        if (viewsWithPriority.length === 0) {
            return this.lastChild();
        }
        return viewsWithPriority.sort(function (a, b) {
            if (!a.priority)
                return 0;
            if (!b.priority)
                return 0;
            return b.priority - a.priority;
        }).reverse()[0];
    };
    LayoutContainer.prototype.arrangeVertical = function () {
        if (!this.children.length)
            return this._height;
        var index = 0;
        var prev = { bottom: this.top + this.paddingTop };
        for (var _i = 0, _a = this.children; _i < _a.length; _i++) {
            var current = _a[_i];
            var space = index === 0 ? 0 : this.divideSpace;
            current.top = prev.bottom + (current.marginTop || prev.marginBottom || space);
            index = index + 1;
            prev = current;
        }
        var last = this.lastChild();
        var height = last.bottom + (last.marginBottom || 0) - this.top + this.paddingBottom;
        var maxHeight = (this.maxHeight || Number.MAX_SAFE_INTEGER);
        if (Math.abs(height - maxHeight) > this.OFFSET) {
            if (height > maxHeight) {
                var v = this.lastPriorityView();
                if (v.height > height - maxHeight && v.shrinkable) {
                    v.height = v.height - (height - maxHeight);
                }
                else {
                    v.hidden = true;
                }
                return this.arrangeVertical();
            }
            else if (this.maxHeight) {
                var flexBoxs = void 0;
                flexBoxs = this.children.filter(function (e) { return e instanceof LayoutContainer && e.isFlexible(); });
                if (flexBoxs.length > 0) {
                    var flexHeight_1 = (maxHeight - height) / flexBoxs.length;
                    flexBoxs.forEach(function (e) {
                        e._height = flexHeight_1;
                    });
                    return this.arrangeVertical();
                }
            }
        }
        this._height = height;
        return height;
    };
    LayoutContainer.prototype.layoutVertical = function () {
        this.arrangeVertical();
        for (var _i = 0, _a = this.children; _i < _a.length; _i++) {
            var current = _a[_i];
            if (current.marginLeft !== undefined) {
                current.left = this.left + current.marginLeft;
            }
            else if (current.marginRight !== undefined) {
                current.right = this.right - current.marginRight;
            }
            else {
                if (this.horizontalAlignment === exports.Alignment.left) {
                    current.left = this.left + this.paddingLeft;
                }
                else if (this.horizontalAlignment === exports.Alignment.right) {
                    current.right = this.right - this.paddingRight;
                }
                else {
                    current.centerX = this.centerX;
                }
            }
            if (current instanceof LayoutContainer && !this.isFlexible()) {
                current.layout();
            }
        }
    };
    LayoutContainer.prototype.arrangeHorizental = function () {
        if (!this.children.length)
            return this._width;
        var index = 0;
        var prev = { right: this.left + this.paddingLeft };
        for (var _i = 0, _a = this.children; _i < _a.length; _i++) {
            var current = _a[_i];
            var space = index === 0 ? 0 : this.divideSpace;
            current.left = prev.right + (current.marginLeft || prev.marginRight || space);
            index = index + 1;
            prev = current;
        }
        var last = this.lastChild();
        var width = last.right + (last.marginRight || 0) - this.left + this.paddingRight;
        var maxWidth = (this.maxWidth || Number.MAX_SAFE_INTEGER);
        if (Math.abs(width - maxWidth) > this.OFFSET) {
            if (width > maxWidth) {
                var v = this.lastPriorityView();
                if (v.width > width - maxWidth && v.shrinkable) {
                    v.width = v.width - (width - maxWidth);
                }
                else {
                    v.hidden = true;
                }
                return this.arrangeHorizental();
            }
            else if (this.maxWidth) {
                var flexBoxs = void 0;
                flexBoxs = this.children.filter(function (e) { return e instanceof LayoutContainer && e.isFlexible(); });
                if (flexBoxs.length > 0) {
                    var flexWidth_1 = (maxWidth - width) / flexBoxs.length;
                    flexBoxs.forEach(function (e) {
                        e._width = flexWidth_1;
                    });
                    return this.arrangeHorizental();
                }
            }
        }
        this._width = width;
        return width;
    };
    LayoutContainer.prototype.arrangeWidth = function () {
        var _this = this;
        if (this.orientation === exports.Orientation.horizontal) {
            return this.arrangeHorizental();
        }
        else {
            return this.children.reduce(function (max, e, index) { return Math.max(max, e.width + (e.marginLeft || 0) + (e.marginRight || 0) + _this.paddingLeft + _this.paddingRight); }, 0);
        }
    };
    LayoutContainer.prototype.layoutHorizontal = function () {
        this.arrangeHorizental();
        for (var _i = 0, _a = this.children; _i < _a.length; _i++) {
            var current = _a[_i];
            if (current.marginTop !== undefined) {
                current.top = this.top + current.marginTop;
            }
            else if (current.marginBottom !== undefined) {
                current.bottom = this.bottom - current.marginBottom;
            }
            else {
                if (this.verticalAlignment === exports.Alignment.top) {
                    current.top = this.top + this.paddingTop;
                }
                else if (this.verticalAlignment === exports.Alignment.bottom) {
                    current.bottom = this.bottom - this.paddingBottom;
                }
                else {
                    current.centerY = this.centerY;
                }
            }
            if (this.baselineAlignment && !current.ignoreBaselineAdjustment) {
                current.baseline = current.bottom;
            }
            if (current instanceof LayoutContainer && !current.isFlexible()) {
                current.layout();
            }
        }
    };
    LayoutContainer.prototype.isFlexible = function () {
        return this instanceof FlexBox;
    };
    LayoutContainer.prototype.lastChild = function () {
        return this.children[this.children.length - 1];
    };
    LayoutContainer.prototype.in = function (bgView) {
        this.subviews.forEach(function (e) {
            if (e instanceof LayoutContainer) {
                e.in(bgView);
            }
            else {
                bgView.addSubView(e);
            }
        });
        return this;
    };
    LayoutContainer.prototype.adjust = function (f) {
        f(this);
        return this;
    };
    LayoutContainer.prototype.as = function (bgView) {
        bgView.width = this.width;
        bgView.height = this.height;
        this.in(bgView);
        return bgView;
    };
    Object.defineProperty(LayoutContainer.prototype, "left", {
        get: function () {
            return this.x;
        },
        set: function (v) {
            this.x = v;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(LayoutContainer.prototype, "right", {
        get: function () {
            return this.x + this.width;
        },
        set: function (v) {
            this.x = v - this.width;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(LayoutContainer.prototype, "top", {
        get: function () {
            return this.y;
        },
        set: function (v) {
            this.y = v;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(LayoutContainer.prototype, "bottom", {
        get: function () {
            return this.y + this.height;
        },
        set: function (v) {
            this.y = v - this.height;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(LayoutContainer.prototype, "centerX", {
        get: function () {
            return this.x + this.width / 2;
        },
        set: function (v) {
            this.x = v - this.width / 2;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(LayoutContainer.prototype, "centerY", {
        get: function () {
            return this.y + this.height / 2;
        },
        set: function (v) {
            this.y = v - this.height / 2;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(LayoutContainer.prototype, "size", {
        get: function () {
            return {
                width: this.width,
                height: this.height
            };
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(LayoutContainer.prototype, "hidden", {
        get: function () {
            return this._hidden;
        },
        set: function (hide) {
            this._hidden = hide;
            for (var _i = 0, _a = this.children; _i < _a.length; _i++) {
                var e = _a[_i];
                e.hidden = hide;
            }
        },
        enumerable: true,
        configurable: true
    });
    return LayoutContainer;
}());
function containerWith(container, elements, option) {
    if (option) {
        container.divideSpace = option.divideSpace || 0;
        container.marginLeft = option.marginLeft;
        container.marginRight = option.marginRight;
        container.marginTop = option.marginTop;
        container.marginBottom = option.marginBottom;
        container.paddingBottom = option.padding || 0;
        container.paddingLeft = option.padding || 0;
        container.paddingRight = option.padding || 0;
        container.paddingTop = option.padding || 0;
        container.paddingLeft = option.paddingHorizontal !== undefined ? option.paddingHorizontal : container.paddingLeft;
        container.paddingRight = option.paddingHorizontal !== undefined ? option.paddingHorizontal : container.paddingRight;
        container.paddingBottom = option.paddingVertical !== undefined ? option.paddingVertical : container.paddingBottom;
        container.paddingTop = option.paddingVertical !== undefined ? option.paddingVertical : container.paddingTop;
        container.paddingTop = option.paddingTop !== undefined ? option.paddingTop : container.paddingTop;
        container.paddingBottom = option.paddingBottom !== undefined ? option.paddingBottom : container.paddingBottom;
        container.paddingLeft = option.paddingLeft !== undefined ? option.paddingLeft : container.paddingLeft;
        container.paddingRight = option.paddingRight !== undefined ? option.paddingRight : container.paddingRight;
        container.left = option.left || 0;
        container.top = option.top || 0;
        container.right = option.right || container.right;
        container.bottom = option.bottom || container.bottom;
        container.centerX = option.centerX || container.centerX;
        container.centerY = option.centerY || container.centerY;
    }
    return container;
}
function vlayout(elements, option) {
    var container = new LayoutContainer;
    container.subviews = elements;
    container.orientation = exports.Orientation.vertical;
    container.maxHeight = option && option.maxHeight;
    container.horizontalAlignment = option && option.align || container.horizontalAlignment;
    containerWith(container, elements, option);
    container.layout();
    return container;
}
function hlayout(elements, option) {
    var container = new LayoutContainer;
    container.subviews = elements;
    container.orientation = exports.Orientation.horizontal;
    container.maxWidth = option && option.maxWidth;
    container.verticalAlignment = option && option.align || container.verticalAlignment;
    containerWith(container, elements, option);
    container.layout();
    return container;
}
var FlexBox = (function (_super) {
    __extends(FlexBox, _super);
    function FlexBox() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return FlexBox;
}(LayoutContainer));
function flexBox() {
    var container = new FlexBox;
    container.orientation = exports.Orientation.horizontal;
    return container;
}

function map(v) {
    switch (v) {
        case 'none': return 0;
        case 'circle': return 1;
        default: return v;
    }
}
var PullRefreshView = (function (_super) {
    __extends(PullRefreshView, _super);
    function PullRefreshView() {
        var _this = _super.call(this) || this;
        _this.type = 10;
        _this.style = 'circle';
        return _this;
    }
    PullRefreshView.viewWithFrame = function (x, y, width, height) {
        var v = new this;
        v._x = x;
        v._y = y;
        v._width = width;
        v._height = height;
        return v;
    };
    PullRefreshView.prototype.info = function () {
        var info = _super.prototype.info.call(this);
        info.style = map(this.style);
        return info;
    };
    return PullRefreshView;
}(BaseView));

var CommandScrollView = (function (_super) {
    __extends(CommandScrollView, _super);
    function CommandScrollView() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    CommandScrollView.prototype.command = function (cmds) {
        _super.prototype.command.call(this, cmds);
    };
    CommandScrollView.prototype.scrollToOffset = function (offset) {
        this.execViewCommand('contentOffset', offset);
    };
    return CommandScrollView;
}(CommandBaseView));
function OverScrollModeMap(mode) {
    switch (mode) {
        case 'always': return 0;
        case 'contentScrolls': return 1;
        case 'never': return 2;
        default: return 2;
    }
}
var ScrollView = (function (_super) {
    __extends(ScrollView, _super);
    function ScrollView() {
        var _this = _super.call(this) || this;
        _this.showScrollIndicator = true;
        _this.scrollEnabled = true;
        _this.overScrollMode = 'never';
        _this.bounces = true;
        _this.animateToOffset = false;
        _this.handleSubItem = function (v) { };
        _this.refreshView = null;
        _this.refreshStatus = 'normal';
        _this.type = 11;
        return _this;
    }
    Object.defineProperty(ScrollView.prototype, "commandRef", {
        get: function () {
            var cmdView = new CommandScrollView;
            this.bindCommandView(cmdView);
            return cmdView;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ScrollView.prototype, "onScroll", {
        get: function () {
            return this.actions['onScroll'];
        },
        set: function (f) {
            this.setAction('onScroll', f);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ScrollView.prototype, "onScrollEnd", {
        set: function (f) {
            this.setAction('onScrollEnd', f);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ScrollView.prototype, "onPullDown", {
        get: function () {
            return this.actions['onPullDown'];
        },
        set: function (f) {
            if (f) {
                this.setAction('onPullDown', f);
                if (!this.refreshView) {
                    this.refreshView = PullRefreshView.viewWithFrame(0, -50, this.width, 50);
                }
            }
            else {
                delete this.actions['onPullDown'];
            }
        },
        enumerable: true,
        configurable: true
    });
    ScrollView.viewWithFrame = function (x, y, width, height) {
        var v = new this;
        v._x = x;
        v._y = y;
        v._width = width;
        v._height = height;
        return v;
    };
    ScrollView.prototype.info = function () {
        var info = _super.prototype.info.call(this);
        info.showScrollIndicator = this.showScrollIndicator;
        info.scrollEnabled = this.scrollEnabled;
        info.overScrollMode = OverScrollModeMap(this.overScrollMode);
        info.bounces = this.bounces;
        if (this.contentOffset) {
            info.contentOffsetX = this.contentOffset.x;
            info.contentOffsetY = this.contentOffset.y;
            info.animateToOffset = this.animateToOffset;
        }
        if (this.onPullDown && this.refreshView) {
            if (this.handleSubItem) {
                this.handleSubItem(this.refreshView);
            }
            info.refreshView = this.refreshView.info();
            info.refreshStatus = this.refreshStatus;
        }
        return info;
    };
    return ScrollView;
}(View));

var CommandInputView = (function (_super) {
    __extends(CommandInputView, _super);
    function CommandInputView() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    CommandInputView.prototype.getFocus = function () {
        this.execViewCommand('getFocus');
    };
    CommandInputView.prototype.clearFocus = function () {
        this.execViewCommand('clearFocus');
    };
    CommandInputView.prototype.clearText = function () {
        this.execViewCommand('clearText');
    };
    CommandInputView.prototype.setCursorIndex = function (cursorIndex) {
        this.execViewCommand('setCursorIndex', { cursorIndex: cursorIndex });
    };
    return CommandInputView;
}(CommandBaseView));
function inputTypeMap(v) {
    switch (v) {
        case 'default': return 0;
        case 'numeric': return 1;
        case 'ASCII': return 2;
        case 'phonePad': return 3;
        case 'decimal': return 4;
        case 'password': return 5;
        default: return v;
    }
}
function actionMap(v) {
    switch (v) {
        case 'default': return -1;
        case 'done': return 0;
        case 'search': return 1;
        case 'next': return 2;
        case 'go': return 3;
        case 'send': return 4;
        default: return v;
    }
}
function alignmentMap$1(v) {
    switch (v) {
        case 'left': return 0;
        case 'right': return 1;
        case 'center': return 2;
        default: return v;
    }
}
var InputView = (function (_super) {
    __extends(InputView, _super);
    function InputView() {
        var _this = _super.call(this) || this;
        _this.inputFocus = undefined;
        _this.handleSubItem = function (v) { };
        _this.type = 14;
        _this.hint = "";
        _this.hintColor = "";
        _this.cursorColor = "";
        _this.inputType = 'default';
        _this.returnAction = 'default';
        _this.textColor = "";
        _this.textSize = 0;
        _this.multiline = false;
        _this.secureTextEntry = false;
        _this.autoFocus = false;
        _this.autoAdjust = true;
        _this.autoAdjustSpace = 0;
        _this.inputAlignment = 'left';
        _this.maxLength = 0;
        _this.showAccessoryView = true;
        _this.setAction('onTextChange', function (param) {
            if (_this.onTextChange) {
                _this.onTextChange(param.newStr, param.cursorIndex);
            }
        });
        return _this;
    }
    Object.defineProperty(InputView.prototype, "commandRef", {
        get: function () {
            var cmdView = new CommandInputView;
            this.bindCommandView(cmdView);
            return cmdView;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(InputView.prototype, "onFocus", {
        get: function () {
            return this.actions['onFocus'];
        },
        set: function (f) {
            this.setAction('onFocus', f);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(InputView.prototype, "onReturnDone", {
        set: function (f) {
            this.setAction('onReturnDone', f);
        },
        enumerable: true,
        configurable: true
    });
    InputView.viewWithFrame = function (x, y, width, height) {
        var v = new this();
        v._x = x;
        v._y = y;
        v._width = width;
        v._height = height;
        return v;
    };
    InputView.prototype.info = function () {
        var info = _super.prototype.info.call(this);
        info.hint = this.hint;
        info.hintColor = this.hintColor;
        info.inputType = inputTypeMap(this.inputType);
        info.returnAction = actionMap(this.returnAction);
        if (this.text !== undefined && this.text != null) {
            info.text = this.text;
        }
        info.textColor = this.textColor;
        info.textSize = this.textSize;
        info.autoFocus = this.autoFocus;
        if (this.inputFocus !== undefined) {
            info.inputFocus = this.inputFocus;
        }
        info.autoAdjust = this.autoAdjust;
        info.autoAdjustSpace = this.autoAdjustSpace;
        info.multiline = this.multiline;
        info.secureTextEntry = this.secureTextEntry;
        info.inputAlignment = alignmentMap$1(this.inputAlignment);
        info.maxLength = this.maxLength;
        info.showAccessoryView = this.showAccessoryView;
        if (this.editable === false) {
            info.editable = this.editable;
        }
        if (this.cursorIndex !== undefined) {
            info.cursorIndex = this.cursorIndex;
        }
        if (this.cursorColor !== '') {
            info.cursorColor = this.cursorColor;
        }
        if (this.autoFillType)
            info.autoFillType = this.autoFillType;
        if (this.keyboardAccessoryView && this.handleSubItem) {
            info.keyboardAccessoryView = this.handleSubItem(this.keyboardAccessoryView);
        }
        if (this.keyboardView && this.handleSubItem) {
            info.keyboardView = this.handleSubItem(this.keyboardView);
        }
        return info;
    };
    return InputView;
}(BaseView));

var ListItem = (function (_super) {
    __extends(ListItem, _super);
    function ListItem() {
        var _this = _super.call(this) || this;
        _this.type = 8;
        return _this;
    }
    ListItem.itemWithReuseId = function (reuseId) {
        var v = new this;
        v.reuseId = reuseId;
        return v;
    };
    ListItem.itemWithUniqueId = function (uniqueId) {
        var v = new this;
        v.uniqueId = uniqueId;
        return v;
    };
    ListItem.prototype.info = function () {
        var info = _super.prototype.info.call(this);
        info.reuseId = this.reuseId;
        if (this.uniqueId)
            info.uniqueId = this.uniqueId;
        if (typeof this.stickyTop !== 'undefined')
            info.stickyTop = this.stickyTop;
        return info;
    };
    return ListItem;
}(View));

function map$1(v) {
    switch (v) {
        case "small": return 0;
        case "large": return 1;
        default: return v;
    }
}
var ActivityIndicator = (function (_super) {
    __extends(ActivityIndicator, _super);
    function ActivityIndicator() {
        var _this = _super.call(this) || this;
        _this.color = '';
        _this.animating = true;
        _this.type = 15;
        _this.style = 'small';
        return _this;
    }
    Object.defineProperty(ActivityIndicator.prototype, "style", {
        get: function () {
            return this._style;
        },
        set: function (v) {
            this._style = v;
            if (0 === map$1(v)) {
                this.size = { width: 20, height: 20 };
            }
            else {
                this.size = { width: 36, height: 36 };
            }
        },
        enumerable: true,
        configurable: true
    });
    ActivityIndicator.viewWithStyle = function (style) {
        var v = new this;
        v.style = style;
        return v;
    };
    ActivityIndicator.prototype.info = function () {
        var info = _super.prototype.info.call(this);
        info.color = this.color;
        info.style = this.style;
        info.animating = this.animating;
        info.style = map$1(this.style);
        return info;
    };
    return ActivityIndicator;
}(BaseView));

var LoadingView = (function () {
    function LoadingView() {
    }
    LoadingView.loadingViewWithWidth = function (width) {
        var v = View.viewWithFrame(0, 0, width, 50);
        var a = new ActivityIndicator();
        a.centerX = v.width / 2;
        a.centerY = v.height / 2;
        v.addSubView(a);
        return v;
    };
    LoadingView.loadingErrorViewWithWidth = function (width, onLoadMoreRetry, errStr) {
        var v = View.viewWithFrame(0, 0, width, 50);
        var tv = TextView.viewWithFrame(0, 0, v.width, v.height);
        tv.text = errStr ? errStr : '加载失败，请点击重试';
        tv.textSize = 20;
        tv.textAlignment = 1;
        tv.onClick = onLoadMoreRetry;
        v.addSubView(tv);
        return v;
    };
    return LoadingView;
}());

var CommandListView = (function (_super) {
    __extends(CommandListView, _super);
    function CommandListView() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    CommandListView.prototype.command = function (cmds) {
        _super.prototype.command.call(this, cmds);
    };
    CommandListView.prototype.scrollToOffset = function (offset) {
        this.execViewCommand('contentOffset', offset);
    };
    CommandListView.prototype.scrollToIndexPath = function (params) {
        this.execViewCommand('scrollToIndexPath', params);
    };
    CommandListView.prototype.stopScroll = function () {
        this.execViewCommand('stopScroll');
    };
    CommandListView.prototype.scrollEnable = function (enable) {
        this.execViewCommand('scrollEnable', { scrollEnable: enable });
    };
    return CommandListView;
}(CommandBaseView));
var ListView = (function (_super) {
    __extends(ListView, _super);
    function ListView() {
        var _this = _super.call(this) || this;
        _this.partRenderOption = undefined;
        _this.sectionCount = 1;
        _this.indexColor = "";
        _this.scrollEnable = true;
        _this.needStopScroll = false;
        _this.scrollsToTop = true;
        _this.handleSubItem = function (v) { };
        _this.initIndex = -1;
        _this.scrollToIndexPath = undefined;
        _this.showScrollIndicator = true;
        _this.animationToIndexPath = false;
        _this.scrollToOffset = undefined;
        _this.animationToOffset = true;
        _this.refreshStatus = 'normal';
        _this.bounces = true;
        _this.estimateItemHeight = 0;
        _this.sectionItemCounts = [];
        _this._innerViews = [];
        _this.type = 9;
        _this.setAction('getItems', function (arg) {
            if (!_this.layoutItem)
                return [];
            var items = [];
            if (!_this.itemCountInSection) {
                _this.itemCountInSection = function () { return _this.itemCount; };
            }
            var section = arg.section;
            var offset = arg.start;
            for (var count = 0; count < arg.length && section < _this.sectionCount; count++) {
                var v = null;
                if (offset < 0) {
                    v = _this.layoutSectionHeader ? _this.layoutSectionHeader(section) : null;
                }
                else {
                    var key = null;
                    if (_this.keyOfItem) {
                        key = _this.keyOfItem(offset, section);
                        if (key) {
                            v = getVCKeyCache(key);
                        }
                    }
                    if (!v)
                        v = _this.layoutItem ? _this.layoutItem(offset, section) : null;
                    if (key && v) {
                        v.key = key;
                    }
                }
                if (v && _this.handleSubItem) {
                    items.push(_this.handleSubItem(v));
                }
                else {
                    items.push({});
                }
                offset++;
                if (offset >= _this.itemCountInSection(section)) {
                    section++;
                    offset = -1;
                }
            }
            return items;
        });
        return _this;
    }
    Object.defineProperty(ListView.prototype, "commandRef", {
        get: function () {
            var cmdView = new CommandListView;
            this.bindCommandView(cmdView);
            return cmdView;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ListView.prototype, "itemActionConfigs", {
        set: function (v) {
            var _this = this;
            this._itemActionConfigs = v;
            this.setAction('onItemAction', function (indexPath) {
                var sectionConfigArray = _this._itemActionConfigs[indexPath.sectionIndex];
                if (sectionConfigArray instanceof Array) {
                    var itemConfigArray = sectionConfigArray[indexPath.itemIndex];
                    if (itemConfigArray instanceof Array) {
                        var itemConfig = itemConfigArray[indexPath.actionIndex];
                        if (itemConfig && itemConfig.action) {
                            itemConfig.action();
                        }
                    }
                }
            });
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ListView.prototype, "onItemClick", {
        set: function (click) {
            this.setAction('onItemClick', click);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ListView.prototype, "onPullDown", {
        get: function () {
            return this.actions['onPullDown'];
        },
        set: function (f) {
            if (f) {
                this.setAction('onPullDown', f);
                if (!this.refreshView) {
                    this.refreshView = PullRefreshView.viewWithFrame(0, -50, this.width, 50);
                }
            }
            else {
                delete this.actions['onPullDown'];
            }
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ListView.prototype, "onItemAppear", {
        set: function (f) {
            this.setAction("onItemAppear", f);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ListView.prototype, "onItemDisappear", {
        set: function (f) {
            this.setAction("onItemDisappear", f);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ListView.prototype, "onScrollStart", {
        set: function (f) {
            this.setAction('onScrollStart', f);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ListView.prototype, "onDirectionChange", {
        set: function (f) {
            this.setAction('onDirectionChange', f);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ListView.prototype, "onScroll", {
        set: function (f) {
            this.setAction('onScroll', f);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ListView.prototype, "onScrollEnd", {
        set: function (f) {
            this.setAction('onScrollEnd', f);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ListView.prototype, "onEndDragging", {
        set: function (f) {
            this.setAction('onEndDragging', f);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ListView.prototype, "willBeginEditing", {
        get: function () {
            return this.actions['willBeginEditing'];
        },
        set: function (f) {
            if (f) {
                this.setAction('willBeginEditing', f);
            }
            else {
                delete this.actions['willBeginEditing'];
            }
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ListView.prototype, "didEndEditing", {
        get: function () {
            return this.actions['didEndEditing'];
        },
        set: function (f) {
            if (f) {
                this.setAction('didEndEditing', f);
            }
            else {
                delete this.actions['didEndEditing'];
            }
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(ListView.prototype, "onLoadMore", {
        get: function () {
            return this.actions['onLoadMore'];
        },
        set: function (f) {
            if (f) {
                this.setAction('onLoadMore', f);
                if (!this.loadingView) {
                    this.loadingView = LoadingView.loadingViewWithWidth(this.width);
                }
            }
            else {
                delete this.actions['onLoadMore'];
            }
        },
        enumerable: true,
        configurable: true
    });
    ListView.viewWithFrame = function (x, y, width, height) {
        var v = new this;
        v._x = x;
        v._y = y;
        v._width = width;
        v._height = height;
        return v;
    };
    ListView.prototype.innerViews = function () {
        return this._innerViews;
    };
    ListView.prototype.info = function () {
        var info = _super.prototype.info.call(this);
        if (this.itemCountInSection) {
            for (var i = 0; i < this.sectionCount; i++) {
                var sectionItemCount = this.itemCountInSection(i);
                this.sectionItemCounts.push(sectionItemCount);
            }
        }
        else {
            this.sectionItemCounts.push(this.itemCount);
        }
        info.sectionItemCounts = this.sectionItemCounts;
        if (this.indexTitleInSection) {
            var indexTitles = [];
            for (var i = 0; i < this.sectionCount; i++) {
                indexTitles.push(this.indexTitleInSection(i));
            }
            info.indexTitles = indexTitles;
        }
        if (this.nestScrollType > 0) {
            info.nestScrollType = this.nestScrollType;
            if (this.nestScrollType === 1) {
                info.captureResponderOffset = this.captureResponderOffset;
            }
            info.captureNestFling = this.captureNestFling;
        }
        info.indexColor = this.indexColor;
        info.estimateItemHeight = this.estimateItemHeight;
        if (this.initIndex >= 0) {
            info.initIndex = this.initIndex;
        }
        info.sectionHeaders = [];
        info.items = [];
        if (partRenderEnabled()) {
            this.partRenderOption = !this.partRenderOption ? { renderHeight: PCSEnvironment.deviceHeight } : this.fixedPartRenderOption(this.partRenderOption);
            this.partFrameRender(info.sectionHeaders, info.items, this.partRenderOption);
        }
        else {
            this.buildSectionItems({ sectionIndex: 0, itemIndex: 0 }, this.lastIndexPath(), info.sectionHeaders, info.items);
        }
        if (this.onPullDown && this.refreshView) {
            if (this.handleSubItem) {
                info.refreshView = this.handleSubItem(this.refreshView);
            }
            info.refreshStatus = this.refreshStatus;
        }
        if (this.loadingView) {
            if (this.handleSubItem) {
                info.loadingView = this.handleSubItem(this.loadingView);
                if (info.items.length === 0) {
                    info.items.push([]);
                    info.sectionHeaders.push({});
                }
            }
        }
        if (this.itemActionConfig) {
            var actionConfigs = [];
            for (var sectionIndex = 0; sectionIndex < this.sectionCount; sectionIndex++) {
                var sectionArray = [];
                for (var itemIndex = 0; itemIndex < this.sectionItemCounts[sectionIndex]; itemIndex++) {
                    var configArray = this.itemActionConfig(itemIndex, sectionIndex);
                    if (configArray instanceof Array) {
                        sectionArray.push(configArray);
                    }
                    else {
                        sectionArray.push([]);
                    }
                }
                actionConfigs.push(sectionArray);
            }
            this.itemActionConfigs = actionConfigs;
            info.itemActionConfigs = actionConfigs;
        }
        if (this.scrollToIndexPath) {
            info.initSection = this.scrollToIndexPath.sectionIndex;
            info.initItem = this.scrollToIndexPath.itemIndex;
        }
        else {
            info.initSection = -1;
            info.initItem = -1;
        }
        info.animationToIndexPath = this.animationToIndexPath;
        info.bounces = this.bounces;
        if (this.scrollBounce) {
            info.scrollBounce = this.scrollBounce;
        }
        info.scrollEnable = this.scrollEnable;
        info.needStopScroll = this.needStopScroll;
        info.scrollsToTop = this.scrollsToTop;
        if (this.scrollToOffset) {
            info.toOffsetX = this.scrollToOffset.x;
            info.toOffsetY = this.scrollToOffset.y;
        }
        info.animationToOffset = this.animationToOffset;
        info.showScrollIndicator = this.showScrollIndicator;
        if (typeof this.stickySectionHeader === "boolean") {
            info.stickySectionHeader = this.stickySectionHeader;
        }
        if (this.listHeaderView) {
            info.listHeaderView = this.handleSubItem(this.listHeaderView);
        }
        if (this.listFooterView) {
            info.listFooterView = this.handleSubItem(this.listFooterView);
        }
        if (this.updateAnimatedIndexPaths) {
            info.updateAction = this.updateAnimatedIndexPaths.action;
            info.updateIndexPath = this.updateAnimatedIndexPaths.indexPaths;
        }
        return info;
    };
    ListView.prototype.fixedPartRenderOption = function (option) {
        if (option.indexPath) {
            var indexpath = { sectionIndex: Math.ceil(option.indexPath.sectionIndex), itemIndex: Math.ceil(option.indexPath.itemIndex) };
            if (indexpath.sectionIndex >= this.sectionCount || (indexpath.sectionIndex === this.sectionCount - 1 && indexpath.itemIndex >= this.sectionItemCounts[this.sectionCount - 1])) {
                indexpath = this.lastIndexPath();
            }
            option.indexPath = indexpath;
            return option;
        }
        return option;
    };
    ListView.prototype.partFrameRender = function (sectionHeaders, items, partRenderOption) {
        if (partRenderOption.indexPath) {
            var partHeight = this.buildSectionItems({ sectionIndex: 0, itemIndex: 0 }, partRenderOption.indexPath, sectionHeaders, items);
            if (isViewStable() && !this.isSameIndexPath(partRenderOption.indexPath, this.lastIndexPath())) {
                if (partHeight >= partRenderOption.renderHeight) {
                    needTwiceRender(this);
                }
                else {
                    var nextIndexPath = void 0;
                    if (partRenderOption.indexPath.itemIndex < this.sectionItemCounts[partRenderOption.indexPath.sectionIndex] - 1) {
                        nextIndexPath = { sectionIndex: partRenderOption.indexPath.sectionIndex, itemIndex: partRenderOption.indexPath.itemIndex + 1 };
                    }
                    else {
                        nextIndexPath = { sectionIndex: partRenderOption.indexPath.sectionIndex + 1, itemIndex: 0 };
                    }
                    this.buildSectionItems(nextIndexPath, this.lastIndexPath(), sectionHeaders, items);
                }
            }
        }
        else {
            var endIndexPath = this.buildSectionItems({ sectionIndex: 0, itemIndex: 0 }, this.lastIndexPath(), sectionHeaders, items, partRenderOption.renderHeight);
            if (isViewStable() && (typeof endIndexPath !== 'number')
                && !this.isSameIndexPath(endIndexPath, this.lastIndexPath())) {
                needTwiceRender(this);
            }
        }
    };
    ListView.prototype.isSameIndexPath = function (indexPath1, indexPath2) {
        if (indexPath1.sectionIndex === indexPath2.sectionIndex && indexPath1.itemIndex === indexPath2.itemIndex) {
            return true;
        }
        return false;
    };
    ListView.prototype.lastIndexPath = function () {
        return { sectionIndex: this.sectionCount - 1, itemIndex: (this.sectionItemCounts[this.sectionCount - 1] - 1) };
    };
    ListView.prototype.isValidStartIndexPath = function (indexPath) {
        return indexPath.sectionIndex >= 0
            && indexPath.sectionIndex < this.sectionCount
            && indexPath.itemIndex >= 0;
    };
    ListView.prototype.isValidEndIndexPath = function (indexPath) {
        return indexPath.sectionIndex >= 0
            && indexPath.sectionIndex < this.sectionCount
            && indexPath.itemIndex < this.sectionItemCounts[indexPath.sectionIndex];
    };
    ListView.prototype.buildSectionItems = function (startIndexPath, endIndexPath, sectionHeaders, items, renderHeight) {
        var height = 0;
        if (!this.isValidStartIndexPath(startIndexPath) || !this.isValidEndIndexPath(endIndexPath)) {
            return height;
        }
        for (var sectionIndex = startIndexPath.sectionIndex; sectionIndex <= endIndexPath.sectionIndex; sectionIndex++) {
            var sectionInfo = this.sectionInfo(sectionIndex);
            sectionHeaders.push(sectionInfo);
            height += sectionInfo.height ? sectionInfo.height : 0;
            var startLoopIndex = sectionIndex === startIndexPath.sectionIndex ? startIndexPath.itemIndex : 0;
            var endLoopIndex = sectionIndex === endIndexPath.sectionIndex ? endIndexPath.itemIndex : (this.sectionItemCounts[sectionIndex] - 1);
            var currentSectionItems = void 0;
            if (sectionIndex < items.length) {
                currentSectionItems = items[sectionIndex];
            }
            else {
                currentSectionItems = [];
                items.push(currentSectionItems);
            }
            for (var itemIndex = startLoopIndex; itemIndex <= endLoopIndex; itemIndex++) {
                var itemInfo = this.itemInfo(sectionIndex, itemIndex);
                currentSectionItems.push(itemInfo);
                height += itemInfo.height ? itemInfo.height : 0;
                if (renderHeight && isViewStable()) {
                    if (this.isSameIndexPath({ sectionIndex: sectionIndex, itemIndex: itemIndex }, this.lastIndexPath()))
                        return { sectionIndex: sectionIndex, itemIndex: itemIndex };
                    if (height >= renderHeight)
                        return { sectionIndex: sectionIndex, itemIndex: itemIndex };
                }
            }
        }
        return height;
    };
    ListView.prototype.sectionInfo = function (sectionIndex) {
        var result = {};
        if (!this.layoutSectionHeader) {
            return result;
        }
        var key = null;
        var v = null;
        if (this.keyOfItem) {
            key = this.keyOfItem(-1, sectionIndex);
            if (key) {
                v = getVCKeyCache(key);
            }
        }
        if (!v)
            v = this.layoutSectionHeader(sectionIndex);
        if (key && v) {
            v.key = key;
        }
        if (v && this.handleSubItem) {
            this._innerViews.push(v);
            result = this.handleSubItem(v);
        }
        return result;
    };
    ListView.prototype.itemInfo = function (sectionIndex, itemIndex) {
        var reuslt = {};
        var iKey = null;
        var iV = null;
        if (this.keyOfItem) {
            iKey = this.keyOfItem(itemIndex, sectionIndex);
            if (iKey) {
                iV = getVCKeyCache(iKey);
            }
        }
        if (!iV) {
            iV = this.layoutItem ? this.layoutItem(itemIndex, sectionIndex) : null;
        }
        if (iV && iKey) {
            iV.key = iKey;
        }
        if (iV && this.handleSubItem) {
            this._innerViews.push(iV);
            reuslt = this.handleSubItem(iV);
        }
        return reuslt;
    };
    return ListView;
}(BaseView));

function animationPropertyMap(v) {
    switch (v) {
        case 'scaleX': return 1;
        case 'scaleY': return 2;
        case 'translateX': return 3;
        case 'translateY': return 4;
        case 'rotate': return 5;
        case 'rotateX': return 6;
        case 'rotateY': return 7;
        case 'backgroundColor': return 8;
        case 'opacity': return 9;
        case 'corner': return 10;
        case 'width': return 11;
        case 'height': return 12;
        case 'position': return 13;
        default: return 0;
    }
}
var AnimationInfo = (function () {
    function AnimationInfo() {
        this.duration = 0;
        this.delay = 0;
        this.repeatCount = 0;
        this.autoreverses = false;
    }
    return AnimationInfo;
}());
var Path = (function () {
    function Path(startPoint) {
        this.startPoint = startPoint;
        this.subPaths = new Array;
    }
    Path.prototype.addLineToPoint = function (endPoint) {
        this.subPaths.push({ pathType: 1, end: endPoint });
    };
    Path.prototype.addAddCurveToPoint = function (control1, control2, endPoint) {
        this.subPaths.push({ pathType: 2, control1: control1, control2: control2, end: endPoint });
    };
    return Path;
}());
var Animation = (function () {
    function Animation() {
        this.animationGroups = [[]];
    }
    Animation.prototype.keyframe = function (animationProperty, param) {
        if (animationProperty === 'scale') {
            this.keyframe('scaleX', param);
            this.keyframe('scaleY', param);
            return this;
        }
        if (animationProperty === 'translate') {
            this.keyframe('translateX', param);
            this.keyframe('translateY', param);
            return this;
        }
        var property = animationPropertyMap(animationProperty);
        if (property === 0)
            return this;
        this.latestAnimationGroup().push({
            property: property,
            duration: param.duration,
            timingFunction: param.timingFunction,
            timingFunctionControlPoints: param.timingFunctionControlPoints,
            delay: param.delay,
            repeatCount: param.repeatCount,
            behaviorType: 1,
            keyframeConfig: this.handleKeyframeConfig(param.keyframeConfig),
        });
        return this;
    };
    Animation.prototype.normal = function (animationProperty, toValue, param) {
        if (animationProperty === 'scale') {
            this.normal('scaleX', toValue, param);
            this.normal('scaleY', toValue, param);
            return this;
        }
        if (animationProperty === 'translate') {
            this.normal('translateX', toValue, param);
            this.normal('translateY', toValue, param);
            return this;
        }
        var property = animationPropertyMap(animationProperty);
        if (property === 0)
            return this;
        this.pushAnimationInfo(property, toValue, param);
        return this;
    };
    Animation.prototype.translate = function (toValueX, param) {
        this.translateX(toValueX, param && param.paramX);
        if (param && param.toValueY !== undefined) {
            this.translateY(param.toValueY, param.paramX);
        }
        else {
            this.translateY(toValueX, param && param.paramX);
        }
        return this;
    };
    Animation.prototype.translateX = function (toValue, param) {
        this.pushAnimationInfo(3, toValue, param);
        return this;
    };
    Animation.prototype.translateY = function (toValue, param) {
        this.pushAnimationInfo(4, toValue, param);
        return this;
    };
    Animation.prototype.scale = function (toValueX, param) {
        this.scaleX(toValueX, param && param.paramX);
        if (param && param.toValueY !== undefined) {
            this.scaleY(param.toValueY, param.paramY);
        }
        else {
            this.scaleY(toValueX, param && param.paramX);
        }
        return this;
    };
    Animation.prototype.scaleX = function (toValue, param) {
        this.pushAnimationInfo(1, toValue, param);
        return this;
    };
    Animation.prototype.scaleY = function (toValue, param) {
        this.pushAnimationInfo(2, toValue, param);
        return this;
    };
    Animation.prototype.rotate = function (toValue, param) {
        this.pushAnimationInfo(5, toValue, param);
        return this;
    };
    Animation.prototype.rotateX = function (toValue, param) {
        this.pushAnimationInfo(6, toValue, param);
        return this;
    };
    Animation.prototype.rotateY = function (toValue, param) {
        this.pushAnimationInfo(7, toValue, param);
        return this;
    };
    Animation.prototype.opacity = function (toValue, param) {
        this.pushAnimationInfo(9, toValue, param);
        return this;
    };
    Animation.prototype.backgroundColor = function (toValue, param) {
        this.pushAnimationInfo(8, toValue, param);
        return this;
    };
    Animation.prototype.step = function (param) {
        this.latestAnimationGroup().forEach(function (animationInfo) {
            if (animationInfo.duration === undefined) {
                animationInfo.duration = param && param.duration || 300;
            }
            if (animationInfo.timingFunction === undefined) {
                animationInfo.timingFunction = param && param.timingFunction;
            }
            if (animationInfo.delay === undefined) {
                animationInfo.delay = param && param.delay;
            }
            if (animationInfo.repeatCount === undefined) {
                animationInfo.repeatCount = param && param.repeatCount;
            }
            if (animationInfo.autoreverses === undefined) {
                animationInfo.autoreverses = param && param.autoreverses;
            }
        });
        this.animationGroups.push([]);
        return this;
    };
    Animation.prototype.latestAnimationGroup = function () {
        if (this.animationGroups.length === 0) {
            this.animationGroups = [[]];
        }
        return this.animationGroups[this.animationGroups.length - 1];
    };
    Animation.prototype.pushAnimationInfo = function (animationProperty, to, param) {
        this.latestAnimationGroup().push({
            property: animationProperty,
            fromValue: this.formatValue(param ? param.fromValue : undefined),
            toValue: this.formatValue(to),
            duration: param && param.duration,
            timingFunction: param && param.timingFunction,
            timingFunctionControlPoints: param && param.timingFunctionControlPoints,
            delay: param && param.delay,
            repeatCount: param && param.repeatCount,
            behaviorType: param && param.behaviorType,
            keyframeConfig: param && param.keyframeConfig,
        });
    };
    Animation.prototype.handleKeyframeConfig = function (kfConfig) {
        var _this = this;
        if (kfConfig && kfConfig.values && kfConfig.values.length > 0) {
            kfConfig.values = kfConfig.values.map(function (value) {
                return _this.formatValue(value);
            });
        }
        return kfConfig;
    };
    Animation.prototype.formatValue = function (value) {
        var result;
        if (value !== undefined) {
            if (this.validatePoint(value)) {
                result = this.formatPoint(value);
            }
            else {
                result = value.toString();
            }
        }
        return result;
    };
    Animation.prototype.validatePoint = function (obj) {
        return obj !== undefined && typeof obj !== 'string' && typeof obj !== 'number' && ('x' in obj) && ('y' in obj);
    };
    Animation.prototype.formatPoint = function (point) {
        return "{" + point.x + "," + point.y + "}";
    };
    Animation.prototype.export = function () {
        var result = [];
        var currentDelay = 0;
        for (var _i = 0, _a = this.animationGroups; _i < _a.length; _i++) {
            var animationGroup = _a[_i];
            var maxDuration = 0;
            for (var _b = 0, animationGroup_1 = animationGroup; _b < animationGroup_1.length; _b++) {
                var animationInfo = animationGroup_1[_b];
                maxDuration = Math.max(maxDuration, (animationInfo.duration || 0) + (animationInfo.delay || 0));
                animationInfo.delay = currentDelay + (animationInfo.delay || 0);
            }
            result = result.concat(animationGroup);
            currentDelay += maxDuration;
        }
        this.animationGroups = [[]];
        return result;
    };
    return Animation;
}());
var AnimationView = (function (_super) {
    __extends(AnimationView, _super);
    function AnimationView() {
        var _this = _super.call(this) || this;
        _this.anchorPoint = { x: 0.5, y: 0.5 };
        _this.type = 16;
        _this.animations = [];
        return _this;
    }
    Object.defineProperty(AnimationView.prototype, "commandRef", {
        get: function () {
            var cmdView = new CommandAnimationView;
            this.bindCommandView(cmdView);
            return cmdView;
        },
        enumerable: true,
        configurable: true
    });
    AnimationView.viewWithFrame = function (x, y, width, height) {
        var v = new this;
        v.x = x;
        v.y = y;
        v.width = width;
        v.height = height;
        return v;
    };
    Object.defineProperty(AnimationView.prototype, "onCompletion", {
        set: function (completion) {
            this.setAction('onCompletion', completion);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(AnimationView.prototype, "onAnimPause", {
        set: function (onPause) {
            this.setAction('onPause', onPause);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(AnimationView.prototype, "onAnimResume", {
        set: function (onResume) {
            this.setAction('onResume', onResume);
        },
        enumerable: true,
        configurable: true
    });
    AnimationView.prototype.info = function () {
        var info = _super.prototype.info.call(this);
        info.animations = this.animations;
        info.transform = this.transform;
        info.anchorPointX = this.anchorPoint.x;
        info.anchorPointY = this.anchorPoint.y;
        if (this.groupAnimationRepeatCount) {
            info.groupAnimationRepeatCount = this.groupAnimationRepeatCount;
        }
        return info;
    };
    return AnimationView;
}(View));
var CommandAnimationView = (function (_super) {
    __extends(CommandAnimationView, _super);
    function CommandAnimationView() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    CommandAnimationView.prototype.pause = function () {
        this.execViewCommand('pause');
    };
    CommandAnimationView.prototype.resume = function () {
        this.execViewCommand('resume');
    };
    CommandAnimationView.prototype.rotate = function (value, direction, anchorPoint) {
        if (anchorPoint) {
            this.execViewCommand('setRotate', { rotation: value, rotateDirection: direction, anchorPointX: anchorPoint.x, anchorPointY: anchorPoint.y });
        }
        else {
            this.execViewCommand('setRotate', { rotation: value, rotateDirection: direction });
        }
    };
    CommandAnimationView.prototype.scale = function (value, anchorPoint) {
        var valX;
        var valY;
        if (value && typeof value === "object") {
            valX = value.scaleX;
            valY = value.scaleY;
        }
        else if (typeof value === "number") {
            valX = value;
            valY = value;
        }
        if (anchorPoint) {
            this.execViewCommand('setScale', { scaleX: valX, scaleY: valY, anchorPointX: anchorPoint.x, anchorPointY: anchorPoint.y });
        }
        else {
            this.execViewCommand('setScale', { scaleX: valX, scaleY: valY });
        }
    };
    CommandAnimationView.prototype.resetTransForm = function () {
        this.execViewCommand('resetTransform');
    };
    return CommandAnimationView;
}(CommandBaseView));

var Switch = (function (_super) {
    __extends(Switch, _super);
    function Switch() {
        var _this = _super.call(this) || this;
        _this.isOn = true;
        _this._width = 51;
        _this._height = 31;
        _this.type = 17;
        _this.setAction('onSwitch', function (arg) {
            _this.isOn = arg.isOn;
            if (_this.onSwitch) {
                _this.onSwitch(arg.isOn);
            }
        });
        return _this;
    }
    Switch.viewWithFrame = function (x, y) {
        var v = new this();
        v._x = x;
        v._y = y;
        return v;
    };
    Switch.prototype.info = function () {
        var info = _super.prototype.info.call(this);
        info.on = this.isOn;
        info.tintColor = this.tintColor || "";
        info.onTintColor = this.onTintColor || "";
        info.thumbTintColor = this.thumbTintColor || "";
        return info;
    };
    return Switch;
}(BaseView));

function flex(element, flexItemOption) {
    return { element: element, flexItemOption: flexItemOption };
}
function flayout(elements, option) {
    var container = new FlexBox$1;
    container.elements = elements;
    container.flexOption = option || {
        flexDirection: "row",
        flexWrap: "wrap",
        justifyContent: "start",
        alignItems: "start",
    };
    container.checkConfigs();
    return container.layout();
}
var FlexLine = (function (_super) {
    __extends(FlexLine, _super);
    function FlexLine() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.flexItems = new Array;
        _this.reverse = false;
        _this.currentSize = 0;
        return _this;
    }
    FlexLine.prototype.config = function (flexOption) {
        var isMainHorizontal = flexOption.flexDirection === "row" || flexOption.flexDirection === "row-reverse";
        this.reverse = flexOption.flexDirection === "row-reverse" || flexOption.flexDirection === "column-reverse";
        this.orientation = isMainHorizontal ? exports.Orientation.horizontal : exports.Orientation.vertical;
        this.maxWidth = flexOption.maxWidth;
        this.maxHeight = flexOption.maxHeight;
        if (this.maxWidth) {
            this.maxWidth -= (flexOption.paddingLeft || 0) + (flexOption.paddingRight || 0);
        }
        if (this.maxHeight) {
            this.maxHeight -= (flexOption.paddingTop || 0) + (flexOption.paddingBottom || 0);
        }
        this.divideSpace = flexOption.itemSpace || 0;
        this.paddingTop = 0;
        this.paddingBottom = 0;
        this.paddingLeft = 0;
        this.paddingRight = 0;
        this.flexWrap = flexOption.flexWrap || "wrap";
        this.justifyContent = flexOption.justifyContent || "start";
        if (this.reverse) {
            if (this.justifyContent === "start") {
                this.justifyContent = "end";
            }
            else if (this.justifyContent === "end") {
                this.justifyContent = "start";
            }
        }
        this.alignItems = flexOption.alignItems || "start";
        if (this.orientation === exports.Orientation.horizontal) {
            switch (this.alignItems) {
                case "start":
                    this.alignHori = exports.Alignment.top;
                    break;
                case "end":
                    this.alignHori = exports.Alignment.bottom;
                    break;
                case "center":
                    this.alignHori = exports.Alignment.center;
                    break;
                case "baseline":
                    this.alignHori = exports.Alignment.baseline;
                    break;
                case "stretch":
                    this.alignHori = exports.Alignment.top;
                    break;
            }
        }
        else if (this.orientation === exports.Orientation.vertical) {
            switch (this.alignItems) {
                case "start":
                    this.alignVert = exports.Alignment.left;
                    break;
                case "end":
                    this.alignVert = exports.Alignment.right;
                    break;
                case "center":
                    this.alignVert = exports.Alignment.center;
                    break;
                case "stretch":
                    this.alignVert = exports.Alignment.left;
                    break;
            }
        }
    };
    FlexLine.prototype.addChild = function (flexItem) {
        if (this.canAdd(flexItem)) {
            this.currentSize += this.getFlexItemSizeMain(flexItem);
            if (this.flexItems.length > 0) {
                this.currentSize += this.divideSpace;
            }
            this.flexItems.push(flexItem);
            return true;
        }
        return false;
    };
    FlexLine.prototype.forceAddChildSingleLine = function (flexItem) {
        if (flexItem.element instanceof BaseView) {
            flexItem.element.shrinkable = true;
        }
        this.currentSize += this.getFlexItemSizeMain(flexItem);
        this.flexItems.push(flexItem);
    };
    FlexLine.prototype.layout = function () {
        var _this = this;
        this.subviews = new Array;
        this.flexItems.forEach(function (e) {
            _this.subviews.push(e.element);
        });
        if (this.reverse) {
            this.flexItems.reverse();
            this.subviews.reverse();
        }
        var sumFlexgrow = 0;
        var sumFlexshrink = 0;
        this.flexItems.forEach(function (e) {
            var flexItemOption = e.flexItemOption;
            if (flexItemOption
                && flexItemOption.flexGrow !== undefined && flexItemOption.flexGrow > 0) {
                sumFlexgrow += flexItemOption.flexGrow;
            }
            if (flexItemOption
                && flexItemOption.flexShrink !== undefined && flexItemOption.flexShrink > 0) {
                sumFlexshrink += flexItemOption.flexShrink;
            }
        });
        var remainSize = this.orientation === exports.Orientation.horizontal ? this.remainWidth(this.subviews, this.maxWidth) : this.remainHeight(this.subviews, this.maxHeight);
        var shrinkSize = 0;
        if (this.orientation === exports.Orientation.horizontal && this.maxWidth) {
            shrinkSize = -this.remainWidth(this.subviews, this.maxWidth);
        }
        else if (this.maxHeight) {
            shrinkSize = -this.remainHeight(this.subviews, this.maxHeight);
        }
        if (sumFlexgrow > 0 && remainSize > 0) {
            var factor = remainSize / sumFlexgrow;
            for (var i = 0; i < this.flexItems.length; i++) {
                var flexItemOption = this.flexItems[i].flexItemOption;
                var itemView = this.subviews[i];
                if (flexItemOption && flexItemOption.flexGrow !== undefined && flexItemOption.flexGrow > 0) {
                    if (this.orientation === exports.Orientation.horizontal) {
                        if (itemView instanceof BaseView) {
                            itemView.width += (factor * flexItemOption.flexGrow);
                        }
                    }
                    else {
                        if (itemView instanceof BaseView) {
                            itemView.height += (factor * flexItemOption.flexGrow);
                        }
                    }
                }
            }
        }
        if (this.flexWrap === "nowrap" && sumFlexshrink && shrinkSize) {
            var factor = shrinkSize / sumFlexshrink;
            for (var i = 0; i < this.flexItems.length; i++) {
                var flexItemOption = this.flexItems[i].flexItemOption;
                var itemView = this.subviews[i];
                if (flexItemOption && flexItemOption.flexShrink !== undefined && flexItemOption.flexShrink > 0) {
                    if (this.orientation === exports.Orientation.horizontal) {
                        if (itemView instanceof BaseView) {
                            itemView.width -= (factor * flexItemOption.flexShrink);
                        }
                    }
                    else {
                        if (itemView instanceof BaseView) {
                            itemView.height -= (factor * flexItemOption.flexShrink);
                        }
                    }
                }
            }
        }
        var container;
        if (this.orientation === exports.Orientation.horizontal) {
            container = this.layoutHori();
        }
        else {
            container = this.layoutVert();
        }
        for (var i = 0; i < this.flexItems.length; i++) {
            var flexItemOption = this.flexItems[i].flexItemOption;
            var itemView = this.subviews[i];
            if (flexItemOption
                && flexItemOption.alignSelf !== undefined) {
                if (this.orientation === exports.Orientation.horizontal) {
                    switch (flexItemOption.alignSelf) {
                        case "start":
                            itemView.marginTop = 0;
                            break;
                        case "end":
                            itemView.marginBottom = 0;
                            break;
                        case "center":
                            itemView.marginTop = container.centerY - itemView.height / 2;
                            break;
                        case "stretch":
                            itemView.marginTop = 0;
                            if (itemView instanceof BaseView) {
                                itemView.height = container.height;
                            }
                            break;
                    }
                }
                else if (this.orientation === exports.Orientation.vertical) {
                    switch (flexItemOption.alignSelf) {
                        case "start":
                            itemView.marginLeft = 0;
                            break;
                        case "end":
                            itemView.marginRight = 0;
                            break;
                        case "center":
                            itemView.marginLeft = container.centerX - itemView.width / 2;
                            break;
                        case "stretch":
                            itemView.marginLeft = 0;
                            if (itemView instanceof BaseView) {
                                itemView.width = container.width;
                            }
                            break;
                    }
                }
            }
            else if (this.alignItems === "stretch") {
                if (this.orientation === exports.Orientation.horizontal) {
                    itemView.marginTop = 0;
                    if (itemView instanceof BaseView) {
                        itemView.height = container.height;
                    }
                }
                else {
                    itemView.marginLeft = 0;
                    if (itemView instanceof BaseView) {
                        itemView.width = container.width;
                    }
                }
            }
        }
        return container;
    };
    FlexLine.prototype.layoutHori = function () {
        var layouts = new Array;
        switch (this.justifyContent) {
            case "start":
                if (this.maxWidth) {
                    this.pushViews(layouts, this.subviews);
                    this.push(layouts, flexBox());
                }
                else {
                    this.pushViews(layouts, this.subviews);
                }
                break;
            case "center":
                if (this.maxWidth) {
                    this.push(layouts, flexBox());
                    this.pushViews(layouts, this.subviews);
                    this.push(layouts, flexBox());
                }
                else {
                    this.pushViews(layouts, this.subviews);
                }
                break;
            case "end":
                if (this.maxWidth) {
                    this.push(layouts, flexBox());
                    this.pushViews(layouts, this.subviews);
                }
                else {
                    this.pushViews(layouts, this.subviews);
                }
                break;
            case "space-between":
                if (this.maxWidth && !this.divideSpace) {
                    var remainWidth = this.remainWidth(this.subviews, this.maxWidth);
                    var divideSpace = 0;
                    if (this.subviews.length - 1 > 0) {
                        divideSpace = remainWidth / (this.subviews.length - 1);
                    }
                    this.divideSpace = divideSpace;
                    this.pushViews(layouts, this.subviews);
                }
                else {
                    this.pushViews(layouts, this.subviews);
                }
                break;
            case "space-around":
                if (this.maxWidth && !this.divideSpace) {
                    var remainWidth = this.remainWidth(this.subviews, this.maxWidth);
                    var divideSpace = 0;
                    if (this.subviews.length > 0) {
                        divideSpace = remainWidth / this.subviews.length;
                    }
                    this.divideSpace = divideSpace;
                    this.paddingLeft = divideSpace / 2;
                    this.paddingRight = divideSpace / 2;
                    this.pushViews(layouts, this.subviews);
                }
                else {
                    if (this.divideSpace) {
                        this.paddingLeft = this.divideSpace / 2;
                        this.paddingRight = this.divideSpace / 2;
                    }
                    this.pushViews(layouts, this.subviews);
                }
                break;
        }
        return hlayout(layouts, {
            maxWidth: this.maxWidth, align: this.alignHori,
            divideSpace: this.divideSpace,
            paddingLeft: this.paddingLeft, paddingRight: this.paddingRight,
        });
    };
    FlexLine.prototype.layoutVert = function () {
        var layouts = new Array;
        switch (this.justifyContent) {
            case "start":
                if (this.maxHeight) {
                    this.pushViews(layouts, this.subviews);
                    this.push(layouts, flexBox());
                }
                else {
                    this.pushViews(layouts, this.subviews);
                }
                break;
            case "center":
                if (this.maxHeight) {
                    this.push(layouts, flexBox());
                    this.pushViews(layouts, this.subviews);
                    this.push(layouts, flexBox());
                }
                else {
                    this.pushViews(layouts, this.subviews);
                }
                break;
            case "end":
                if (this.maxHeight) {
                    this.push(layouts, flexBox());
                    this.pushViews(layouts, this.subviews);
                }
                else {
                    this.pushViews(layouts, this.subviews);
                }
                break;
            case "space-between":
                if (this.maxHeight && !this.divideSpace) {
                    var remainHeight = this.remainHeight(this.subviews, this.maxHeight);
                    var divideSpace = 0;
                    if (this.subviews.length - 1 > 0) {
                        divideSpace = remainHeight / (this.subviews.length - 1);
                    }
                    this.divideSpace = divideSpace;
                    this.pushViews(layouts, this.subviews);
                }
                else {
                    this.pushViews(layouts, this.subviews);
                }
                break;
            case "space-around":
                if (this.maxHeight && !this.divideSpace) {
                    var remainHeight = this.remainHeight(this.subviews, this.maxHeight);
                    var divideSpace = 0;
                    if (this.subviews.length > 0) {
                        divideSpace = remainHeight / this.subviews.length;
                    }
                    this.divideSpace = divideSpace;
                    this.paddingTop = divideSpace / 2;
                    this.paddingBottom = divideSpace / 2;
                    this.pushViews(layouts, this.subviews);
                }
                else {
                    if (this.divideSpace) {
                        this.paddingTop = this.divideSpace / 2;
                        this.paddingBottom = this.divideSpace / 2;
                    }
                    this.pushViews(layouts, this.subviews);
                }
                break;
        }
        return vlayout(layouts, {
            maxHeight: this.maxHeight, align: this.alignVert,
            divideSpace: this.divideSpace,
            paddingTop: this.paddingTop, paddingBottom: this.paddingBottom,
        });
    };
    FlexLine.prototype.pushViews = function (layouts, views) {
        views.forEach(function (view) {
            layouts.push(view);
        });
    };
    FlexLine.prototype.push = function (layouts, view) {
        layouts.push(view);
    };
    FlexLine.prototype.remainHeight = function (views, maxHeight) {
        if (maxHeight) {
            return maxHeight - vlayout(views).height;
        }
        return 0;
    };
    FlexLine.prototype.remainWidth = function (views, maxWidth) {
        if (maxWidth) {
            return maxWidth - hlayout(views).width;
        }
        return 0;
    };
    FlexLine.prototype.canAdd = function (flexItem) {
        if (this.flexWrap === "nowrap") {
            if (flexItem.flexItemOption && flexItem.flexItemOption.flexShrink) {
                if (flexItem.element instanceof BaseView) {
                    flexItem.element.shrinkable = true;
                }
            }
            return true;
        }
        if (this.orientation === exports.Orientation.horizontal) {
            if (this.maxWidth) {
                if (this.flexItems.length === 0) {
                    return this.maxWidth >= this.currentSize + this.getFlexItemSizeMain(flexItem);
                }
                return this.maxWidth >= this.currentSize + this.divideSpace + this.getFlexItemSizeMain(flexItem);
            }
            return true;
        }
        else {
            if (this.maxHeight) {
                if (this.flexItems.length === 0) {
                    return this.maxHeight >= this.currentSize + this.getFlexItemSizeMain(flexItem);
                }
                return this.maxHeight >= this.currentSize + this.divideSpace + this.getFlexItemSizeMain(flexItem);
            }
            return true;
        }
    };
    FlexLine.prototype.getFlexItemSizeMain = function (flexItem) {
        if (this.orientation === exports.Orientation.horizontal) {
            return flexItem.element.width;
        }
        return flexItem.element.height;
    };
    return FlexLine;
}(LayoutContainer));
var FlexBox$1 = (function (_super) {
    __extends(FlexBox, _super);
    function FlexBox() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.flexOption = {};
        _this.elements = [];
        _this.flexItems = new Array;
        _this.flexLines = new Array;
        return _this;
    }
    FlexBox.prototype.checkConfigs = function () {
        if (this.flexOption.flexDirection === undefined && this.flexOption.orientation === undefined) {
            this.flexDirection = "row";
        }
        else if (this.flexOption.flexDirection === undefined) {
            if (this.flexOption.orientation === exports.Orientation.horizontal) {
                this.flexDirection = "row";
            }
            else {
                this.flexDirection = "column";
            }
        }
        else {
            this.flexDirection = this.flexOption.flexDirection;
        }
        if (this.flexOption.flexWrap === undefined && this.flexOption.wrap === undefined) {
            this.flexWrap = "wrap";
        }
        else if (this.flexOption.flexWrap === undefined) {
            if (this.flexOption.wrap) {
                this.flexWrap = "wrap";
            }
            else {
                this.flexWrap = "nowrap";
            }
        }
        else {
            this.flexWrap = this.flexOption.flexWrap;
        }
        if (this.flexOption.justifyContent === undefined && this.flexOption.contentAlign === undefined) {
            this.justifyContent = "start";
        }
        else if (this.flexOption.justifyContent === undefined) {
            if (this.flexDirection === "row") {
                switch (this.flexOption.contentAlign) {
                    case exports.Alignment.left:
                        this.justifyContent = "start";
                        break;
                    case exports.Alignment.right:
                        this.justifyContent = "end";
                        break;
                    case exports.Alignment.center:
                        this.justifyContent = "center";
                        break;
                    default:
                        this.justifyContent = "start";
                        break;
                }
            }
            else if (this.flexDirection === "row-reverse") {
                switch (this.flexOption.contentAlign) {
                    case exports.Alignment.left:
                        this.justifyContent = "end";
                        break;
                    case exports.Alignment.right:
                        this.justifyContent = "start";
                        break;
                    case exports.Alignment.center:
                        this.justifyContent = "center";
                        break;
                    default:
                        this.justifyContent = "start";
                        break;
                }
            }
            else if (this.flexDirection === "column") {
                switch (this.flexOption.contentAlign) {
                    case exports.Alignment.top:
                        this.justifyContent = "start";
                        break;
                    case exports.Alignment.bottom:
                        this.justifyContent = "end";
                        break;
                    case exports.Alignment.center:
                        this.justifyContent = "center";
                        break;
                    default:
                        this.justifyContent = "start";
                        break;
                }
            }
            else if (this.flexDirection === "column-reverse") {
                switch (this.flexOption.contentAlign) {
                    case exports.Alignment.top:
                        this.justifyContent = "end";
                        break;
                    case exports.Alignment.bottom:
                        this.justifyContent = "start";
                        break;
                    case exports.Alignment.center:
                        this.justifyContent = "center";
                        break;
                    default:
                        this.justifyContent = "start";
                        break;
                }
            }
        }
        else {
            this.justifyContent = this.flexOption.justifyContent;
        }
        if (this.flexOption.alignItems === undefined && this.flexOption.itemsAlign === undefined) {
            this.alignItems = "start";
        }
        else if (this.flexOption.alignItems === undefined) {
            if (this.flexDirection === "row"
                || this.flexDirection === "row-reverse") {
                switch (this.flexOption.itemsAlign) {
                    case exports.Alignment.top:
                        this.alignItems = "start";
                        break;
                    case exports.Alignment.bottom:
                        this.alignItems = "end";
                        break;
                    case exports.Alignment.center:
                        this.alignItems = "center";
                        break;
                    default:
                        this.alignItems = "start";
                        break;
                }
            }
            else if (this.flexDirection === "column"
                || this.flexOption.flexDirection === "column-reverse") {
                switch (this.flexOption.itemsAlign) {
                    case exports.Alignment.left:
                        this.alignItems = "start";
                        break;
                    case exports.Alignment.right:
                        this.alignItems = "end";
                        break;
                    case exports.Alignment.center:
                        this.alignItems = "center";
                        break;
                    default:
                        this.alignItems = "start";
                        break;
                }
            }
        }
        else {
            this.alignItems = this.flexOption.alignItems;
        }
        if (this.flexOption.alignContent === undefined && this.flexOption.linesAlign === undefined) {
            this.alignContent = "start";
        }
        else if (this.flexOption.alignContent === undefined) {
            if (this.flexDirection === "row"
                || this.flexDirection === "row-reverse") {
                switch (this.flexOption.linesAlign) {
                    case exports.Alignment.top:
                        this.alignContent = "start";
                        break;
                    case exports.Alignment.bottom:
                        this.alignContent = "end";
                        break;
                    case exports.Alignment.center:
                        this.alignContent = "center";
                        break;
                    default:
                        this.alignContent = "start";
                        break;
                }
            }
            else if (this.flexDirection === "column"
                || this.flexDirection === "column-reverse") {
                switch (this.flexOption.linesAlign) {
                    case exports.Alignment.left:
                        this.alignContent = "start";
                        break;
                    case exports.Alignment.right:
                        this.alignContent = "end";
                        break;
                    case exports.Alignment.center:
                        this.alignContent = "center";
                        break;
                    default:
                        this.alignContent = "start";
                        break;
                }
            }
        }
        else {
            this.alignContent = this.flexOption.alignContent;
        }
        if (this.flexWrap === "wrap-reverse") {
            if (this.alignContent === "start") {
                this.alignContent = "end";
            }
            else if (this.alignContent === "end") {
                this.alignContent = "start";
            }
        }
        this.maxWidth = this.flexOption.maxWidth || this.maxWidth;
        this.maxHeight = this.flexOption.maxHeight || this.maxHeight;
        this.divideSpace = this.flexOption.divideSpace || this.divideSpace;
        this.itemSpace = this.flexOption.itemSpace || 0;
        this.marginLeft = this.flexOption.marginLeft || this.marginLeft;
        this.marginRight = this.flexOption.marginRight || this.marginRight;
        this.marginTop = this.flexOption.marginTop || this.marginTop;
        this.marginBottom = this.flexOption.marginBottom || this.marginBottom;
        this.paddingBottom = this.flexOption.padding || this.paddingBottom;
        this.paddingLeft = this.flexOption.padding || this.paddingLeft;
        this.paddingRight = this.flexOption.padding || this.paddingRight;
        this.paddingTop = this.flexOption.padding || this.paddingTop;
        this.paddingLeft = this.flexOption.paddingHorizontal !== undefined ? this.flexOption.paddingHorizontal : this.paddingLeft;
        this.paddingRight = this.flexOption.paddingHorizontal !== undefined ? this.flexOption.paddingHorizontal : this.paddingRight;
        this.paddingBottom = this.flexOption.paddingVertical !== undefined ? this.flexOption.paddingVertical : this.paddingBottom;
        this.paddingTop = this.flexOption.paddingVertical !== undefined ? this.flexOption.paddingVertical : this.paddingTop;
        this.paddingTop = this.flexOption.paddingTop !== undefined ? this.flexOption.paddingTop : this.paddingTop;
        this.paddingBottom = this.flexOption.paddingBottom !== undefined ? this.flexOption.paddingBottom : this.paddingBottom;
        this.paddingLeft = this.flexOption.paddingLeft !== undefined ? this.flexOption.paddingLeft : this.paddingLeft;
        this.paddingRight = this.flexOption.paddingRight !== undefined ? this.flexOption.paddingRight : this.paddingRight;
        this.left = this.flexOption.left || this.left;
        this.top = this.flexOption.top || this.top;
    };
    FlexBox.prototype.layout = function () {
        this.genFlexItems();
        this.sortOrder();
        switch (this.flexDirection) {
            case "row":
                return this.layoutRows();
            case "row-reverse":
                return this.layoutRows();
            case "column":
                return this.layoutColumns();
            case "column-reverse":
                return this.layoutColumns();
        }
        return this;
    };
    FlexBox.prototype.getChildCount = function () {
        return this.flexItems.length;
    };
    FlexBox.prototype.getChildViewAt = function (index) {
        return this.flexItems[index].element;
    };
    FlexBox.prototype.getChildAt = function (index) {
        return this.flexItems[index];
    };
    FlexBox.prototype.wrapFlexItem = function (view) {
        if (view && !(view instanceof BaseView) && !(view instanceof LayoutContainer)) {
            return view;
        }
        if (view.shrinkable === false) {
            return { element: view };
        }
        return { element: view, flexItemOption: { flexShrink: 1 } };
    };
    FlexBox.prototype.genFlexItems = function () {
        var _this = this;
        this.elements.forEach(function (e) {
            _this.flexItems.push(_this.wrapFlexItem(e));
        });
    };
    FlexBox.prototype.sortOrder = function () {
        this.flexItems.sort(function (a, b) {
            var aOrder = 0;
            var bOrder = 0;
            if (a.flexItemOption && a.flexItemOption.order) {
                aOrder = a.flexItemOption.order;
            }
            if (b.flexItemOption && b.flexItemOption.order) {
                bOrder = b.flexItemOption.order;
            }
            return aOrder - bOrder;
        });
    };
    FlexBox.prototype.genLayoutOption = function () {
        return {
            left: this.flexOption.left,
            right: this.flexOption.right,
            top: this.flexOption.top,
            bottom: this.flexOption.bottom,
            centerX: this.flexOption.centerX,
            centerY: this.flexOption.centerY,
            marginLeft: this.marginLeft,
            marginRight: this.marginRight,
            marginTop: this.marginTop,
            marginBottom: this.marginBottom,
            paddingLeft: this.paddingLeft,
            paddingRight: this.paddingRight,
            paddingTop: this.paddingTop,
            paddingBottom: this.paddingBottom,
            divideSpace: this.divideSpace,
            maxHeight: this.maxHeight,
            maxWidth: this.maxWidth,
        };
    };
    FlexBox.prototype.genFlexLines = function () {
        var flexLines = new Array();
        var flexLine = new FlexLine;
        flexLine.config(this);
        var childCount = this.getChildCount();
        for (var i = 0; i < childCount; i++) {
            var child = this.getChildViewAt(i);
            if (!child) {
                continue;
            }
            else if (child.hidden) {
                continue;
            }
            var flexItem = this.getChildAt(i);
            if (flexLine.addChild(flexItem) === false) {
                flexLines.push(flexLine);
                flexLine = new FlexLine;
                flexLine.config(this);
                if (flexLine.addChild(flexItem) === false) {
                    flexLine.forceAddChildSingleLine(flexItem);
                    flexLines.push(flexLine);
                    flexLine = new FlexLine;
                    flexLine.config(this);
                }
                continue;
            }
        }
        flexLines.push(flexLine);
        var reverse = this.flexWrap === "wrap-reverse";
        if (reverse) {
            flexLines.reverse();
        }
        return flexLines;
    };
    FlexBox.prototype.layoutRows = function () {
        this.flexLines = this.genFlexLines();
        var layouts = new Array;
        switch (this.alignContent) {
            case "start":
                if (this.maxHeight) {
                    this.pushLines(layouts, this.flexLines);
                }
                else {
                    this.pushLines(layouts, this.flexLines);
                }
                break;
            case "center":
                if (this.maxHeight) {
                    this.push(layouts, flexBox());
                    this.pushLines(layouts, this.flexLines);
                    this.push(layouts, flexBox());
                }
                else {
                    this.pushLines(layouts, this.flexLines);
                }
                break;
            case "end":
                if (this.maxHeight) {
                    this.push(layouts, flexBox());
                    this.pushLines(layouts, this.flexLines);
                }
                else {
                    this.pushLines(layouts, this.flexLines);
                }
                break;
            case "space-between":
                if (this.maxHeight && !this.divideSpace) {
                    this.pushLines(layouts, this.flexLines);
                    var remainHeight = this.remainHeight(this.flexLines)
                        - (this.paddingTop !== undefined ? this.paddingTop : 0)
                        - (this.paddingBottom !== undefined ? this.paddingBottom : 0);
                    var divideSpace = 0;
                    if (this.flexLines.length - 1 > 0) {
                        divideSpace = remainHeight / (this.flexLines.length - 1);
                    }
                    this.divideSpace = divideSpace;
                }
                else {
                    this.pushLines(layouts, this.flexLines);
                }
                break;
            case "space-around":
                if (this.maxHeight && !this.divideSpace) {
                    this.pushLines(layouts, this.flexLines);
                    var remainHeight = this.remainHeight(this.flexLines);
                    var divideSpace = 0;
                    if (this.flexLines.length > 0) {
                        divideSpace = remainHeight / this.flexLines.length;
                    }
                    this.divideSpace = divideSpace;
                    this.paddingTop = divideSpace / 2;
                    this.paddingBottom = divideSpace / 2;
                }
                else {
                    if (this.divideSpace) {
                        this.paddingTop = this.divideSpace / 2;
                        this.paddingBottom = this.divideSpace / 2;
                    }
                    this.pushLines(layouts, this.flexLines);
                }
                break;
            case "stretch":
                if (this.maxHeight) {
                    this.pushLines(layouts, this.flexLines);
                    var remainHeight = this.remainHeight(this.flexLines);
                    var divideSpace = 0;
                    if (this.flexLines.length > 0) {
                        divideSpace = remainHeight / this.flexLines.length;
                    }
                    this.divideSpace = divideSpace;
                    this.paddingTop = 0;
                    this.paddingBottom = divideSpace;
                }
                else {
                    this.pushLines(layouts, this.flexLines);
                }
                break;
        }
        return vlayout(layouts, this.genLayoutOption());
    };
    FlexBox.prototype.layoutColumns = function () {
        this.flexLines = this.genFlexLines();
        var layouts = new Array;
        switch (this.alignContent) {
            case "start":
                if (this.maxWidth) {
                    this.pushLines(layouts, this.flexLines);
                }
                else {
                    this.pushLines(layouts, this.flexLines);
                }
                break;
            case "center":
                if (this.maxWidth) {
                    this.push(layouts, flexBox());
                    this.pushLines(layouts, this.flexLines);
                    this.push(layouts, flexBox());
                }
                else {
                    this.pushLines(layouts, this.flexLines);
                }
                break;
            case "end":
                if (this.maxWidth) {
                    this.push(layouts, flexBox());
                    this.pushLines(layouts, this.flexLines);
                }
                else {
                    this.pushLines(layouts, this.flexLines);
                }
                break;
            case "space-between":
                if (this.maxWidth && !this.divideSpace) {
                    this.pushLines(layouts, this.flexLines);
                    var remainWidth = this.remainWidth(this.flexLines);
                    var divideSpace = 0;
                    if (this.flexLines.length - 1 > 0) {
                        divideSpace = remainWidth / (this.flexLines.length - 1);
                    }
                    this.divideSpace = divideSpace;
                }
                else {
                    this.pushLines(layouts, this.flexLines);
                }
                break;
            case "space-around":
                if (this.maxWidth && !this.divideSpace) {
                    this.pushLines(layouts, this.flexLines);
                    var remainWidth = this.remainWidth(this.flexLines);
                    var divideSpace = 0;
                    if (this.flexLines.length > 0) {
                        divideSpace = remainWidth / this.flexLines.length;
                    }
                    this.divideSpace = divideSpace;
                    this.paddingLeft = divideSpace / 2;
                    this.paddingRight = divideSpace / 2;
                }
                else {
                    if (this.divideSpace) {
                        this.paddingLeft = this.divideSpace / 2;
                        this.paddingRight = this.divideSpace / 2;
                    }
                    this.pushLines(layouts, this.flexLines);
                }
                break;
            case "stretch":
                if (this.maxWidth) {
                    this.pushLines(layouts, this.flexLines);
                    var remainWidth = this.remainWidth(this.flexLines);
                    var divideSpace = 0;
                    if (this.flexLines.length > 0) {
                        divideSpace = remainWidth / this.flexLines.length;
                    }
                    this.divideSpace = divideSpace;
                    this.paddingLeft = 0;
                    this.paddingRight = divideSpace;
                }
                else {
                    this.pushLines(layouts, this.flexLines);
                }
                break;
        }
        return hlayout(layouts, this.genLayoutOption());
    };
    FlexBox.prototype.pushLines = function (layouts, flexLines) {
        flexLines.forEach(function (line) {
            layouts.push(line.layout());
        });
    };
    FlexBox.prototype.push = function (layouts, view) {
        layouts.push(view);
    };
    FlexBox.prototype.remainHeight = function (flexLines) {
        if (this.maxHeight) {
            var sumHeight_1 = 0;
            if (flexLines.length > 0) {
                flexLines.forEach(function (e) {
                    sumHeight_1 += e.height;
                });
                return this.maxHeight - sumHeight_1;
            }
        }
        return 0;
    };
    FlexBox.prototype.remainWidth = function (flexLines) {
        if (this.maxWidth) {
            var sumWidth_1 = 0;
            if (flexLines.length > 0) {
                flexLines.forEach(function (e) {
                    sumWidth_1 += e.width;
                });
                return this.maxWidth - sumWidth_1;
            }
        }
        return 0;
    };
    return FlexBox;
}(LayoutContainer));

var PicassoController = (function () {
    function PicassoController() {
    }
    PicassoController.prototype.onLoad = function () {
    };
    PicassoController.prototype.injectNativeData = function (data) {
        if (typeof data === 'object' && data._picasso_view_input_array_data_) {
            this.intentData = data._picasso_view_input_array_data_;
        }
        else {
            this.intentData = data;
        }
    };
    PicassoController.prototype.onLiveLoad = function () {
    };
    return PicassoController;
}());

var object_id_count = 0;
function hash(obj) {
    var o = obj;
    if (o.___objectid___)
        return o.___objectid___;
    object_id_count = (object_id_count + 1) % Number.MAX_SAFE_INTEGER;
    o.___objectid___ = object_id_count;
    return object_id_count;
}

var ModelCache = (function () {
    function ModelCache() {
        this.caches = {};
    }
    ModelCache.prototype.getAllCache = function () {
        return this.caches;
    };
    ModelCache.prototype.setAllCache = function (caches) {
        this.caches = caches;
    };
    ModelCache.prototype.clearCache = function () {
        this.caches = {};
    };
    ModelCache.prototype.getCached = function (v) {
        if (v.key)
            return this.caches[hash(v.key)];
        return null;
    };
    ModelCache.prototype.getCachedByKey = function (key) {
        if (key)
            return this.caches[hash(key)];
        return null;
    };
    ModelCache.prototype.setCache = function (v) {
        if (v.key) {
            this.caches[hash(v.key)] = v;
        }
    };
    return ModelCache;
}());

function isSizeToFitInterface(v) {
    return v.isNeedSizeToFit !== undefined;
}
function isSubItemHandler(v) {
    return v.handleSubItem !== undefined;
}
function isInnerViewsHandler(v) {
    return v.innerViews !== undefined;
}
var VC = (function (_super) {
    __extends(VC, _super);
    function VC() {
        var _this = _super.call(this) || this;
        _this._actionMapGroups = new Array();
        _this._partActionMapGroups = new Array();
        _this.keyCache = new ModelCache;
        _this._sizeCache = {};
        _this.needSizeToFitViews = [];
        _this.twiceRenderViews = [];
        _this.partRenderEnabled = false;
        _this.isLayouting = false;
        _this.layoutCount = 0;
        _this._partComponentMaps = new Array();
        _this.childrenVC = {};
        _this.childrenId = 0;
        return _this;
    }
    VC.prototype.currentVCInfo = function () {
        var cache = new Set();
        return JSON.stringify(this, function (key, value) {
            var ignoreKeySet = new Set(['context', '_actions', '_actionMapGroups', '_partActionMapGroups', 'keyCache', '_sizeCache', 'needSizeToFitViews', 'twiceRenderViews', '_cacheComponentMap', '_wholeComponentMap', '_partComponentMaps', 'partRenderEnabled', 'layoutCount', 'isLayouting', 'hostId', 'childrenVC', 'childrenId']);
            if (ignoreKeySet.has(key)) {
                return;
            }
            if (typeof value === 'object' && value !== null) {
                if (cache.has(value)) {
                    return;
                }
                cache.add(value);
            }
            return value;
        });
    };
    VC.prototype.getKeyCache = function () {
        return this.keyCache;
    };
    VC.prototype.isViewStable = function () {
        return this.needSizeToFitViews.length === 0;
    };
    VC.prototype.needTwiceRender = function (view) {
        this.twiceRenderViews.push(view);
    };
    VC.prototype.getSizeCache = function () {
        return this._sizeCache;
    };
    VC.prototype.onLoad = function () {
        _super.prototype.onLoad.call(this);
    };
    VC.prototype.onAppear = function () { };
    VC.prototype.onDisappear = function () { };
    VC.prototype.onReopen = function () { };
    VC.prototype.onBackPressed = function () { };
    VC.prototype.onDestroy = function () { };
    VC.prototype.onFrameChanged = function (frame) { };
    VC.prototype.onKeyboardStatusChanged = function (keyboardInfo) { };
    VC.prototype.onLayoutFinished = function () { };
    Object.defineProperty(VC.prototype, "width", {
        get: function () {
            return this.options.width;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(VC.prototype, "height", {
        get: function () {
            return this.options.height;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(VC.prototype, "md5", {
        get: function () {
            return this.options.md5;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(VC.prototype, "extraData", {
        get: function () {
            return this.options.extraData;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(VC.prototype, "bounds", {
        get: function () {
            return {
                x: 0,
                y: 0,
                width: this.width,
                height: this.height
            };
        },
        enumerable: true,
        configurable: true
    });
    VC.prototype.needLayout = function () {
        if (this.isLayouting) {
            if (PCSEnvironment.isDebug) {
                throw new Error("您的代码在layout()执行过程中调用了needLayout，可能会引起死循环，请检查代码并修改");
            }
            this.needLayoutAsync();
            return;
        }
        this.context.sendMessage('vc', 'needLayout', null);
    };
    VC.prototype.needPartRenderOnNextLayout = function () {
        this.partRenderEnabled = true;
    };
    VC.prototype.shouldPartRender = function () {
        return this.partRenderEnabled;
    };
    VC.prototype.needLayoutAsync = function () {
        this.context.sendMessage('vc', 'needLayoutAsync', null);
    };
    VC.prototype.clearCachedKeys = function () {
        this.keyCache.clearCache();
        this.context.sendMessage('vc', 'clearCachedKeys', null);
    };
    VC.prototype.sendMsg = function (params) {
        this.context.sendMessage("vc", "sendMsg", params);
    };
    VC.prototype.dispatchOnLoad = function () {
        setCurrentVC(this);
        this.onLoad();
    };
    VC.prototype.dispatchOnAppear = function () {
        setCurrentVC(this);
        this.onAppear();
    };
    VC.prototype.dispatchOnDisappear = function () {
        this.onDisappear();
    };
    VC.prototype.dispatchOnReopen = function () {
        setCurrentVC(this);
        this.onReopen();
    };
    VC.prototype.dispatchOnBackPressed = function () {
        setCurrentVC(this);
        this.onBackPressed();
    };
    VC.prototype.dispatchOnDestroy = function () {
        this.onDestroy();
    };
    VC.prototype.dispatchOnFrameChanged = function (frame) {
        this.options.width = frame.width;
        this.options.height = frame.height;
        this.needLayout();
        this.updateChildVCFrame(frame);
        this.onFrameChanged(frame);
    };
    VC.prototype.dispatchOnKeyboardStatusChanged = function (keyboardInfo) {
        this.onKeyboardStatusChanged(keyboardInfo);
    };
    VC.prototype.dispatchOnLayoutFinished = function () {
        this.onLayoutFinished();
    };
    VC.prototype.dispatchLayoutChildVCArray = function (param) {
        var childVCInfoList = [];
        if (!(param && param.vcIds && param.vcIds.length > 0)) {
            return childVCInfoList;
        }
        var childVCInfoMap = {};
        this.innerLayoutChildVCs(param.vcIds, childVCInfoMap);
        for (var key in childVCInfoMap) {
            if (childVCInfoMap.hasOwnProperty(key)) {
                var vcInfo = childVCInfoMap[key];
                childVCInfoList.push({ vcId: Number(key), info: vcInfo });
            }
        }
        return childVCInfoList;
    };
    VC.prototype.cleanAcionMapGroup = function (endIndex) {
        if (this._actionMapGroups.length <= 2)
            return;
        this._actionMapGroups = this._actionMapGroups.slice(0, Math.max(endIndex + 1, 2));
    };
    VC.prototype.getActionMap = function (viewId) {
        var cachePartAcionMap = this._partActionMapGroups.find(function (actionMap) {
            var cached = actionMap && actionMap[viewId] !== undefined;
            return cached;
        });
        if (cachePartAcionMap) {
            return cachePartAcionMap[viewId];
        }
        var catchedIndex = this._actionMapGroups.length;
        var cachedActionMap = this._actionMapGroups.find(function (actionMap, index) {
            var cached = actionMap && actionMap[viewId] !== undefined;
            if (cached)
                catchedIndex = index;
            return cached;
        });
        if (cachedActionMap) {
            this.cleanAcionMapGroup(catchedIndex);
            return cachedActionMap[viewId];
        }
        return undefined;
    };
    VC.prototype.dispatchActionByNative = function (args) {
        setCurrentVC(this);
        pLogInfo('args=' + JSON.stringify(args));
        for (var _i = 0, _a = Object.keys(this.childrenVC); _i < _a.length; _i++) {
            var key = _a[_i];
            var vc = this.childrenVC[key];
            if (!vc) {
                continue;
            }
            var childActionMap = vc.getActionMap(args.id);
            if (childActionMap) {
                if (childActionMap[args.action]) {
                    return childActionMap[args.action](args.param);
                }
                pLogError("Cannot find ActionMap in ChildVC " + key + " for " + args.id + ",action=" + args.action);
                return;
            }
        }
        var actionMap = this.getActionMap(args.id);
        if (!actionMap) {
            pLogError("Cannnot find ActionMap for " + args.id);
            return;
        }
        if (!actionMap[args.action]) {
            pLogError("Cannnot find Action callback for " + args.id + ", action = " + args.action);
            return;
        }
        return actionMap[args.action](args.param);
    };
    VC.prototype.setViewAction = function (viewId, action, callback) {
        if (this._actions) {
            var actionMap = this._actions[viewId];
            if (actionMap === undefined) {
                actionMap = {};
                this._actions[viewId] = actionMap;
            }
            actionMap[action] = callback;
        }
    };
    VC.prototype.infoFilter = function (v) {
        if (!v.key) {
            if (v.hidden) {
                var hiddenInfo = {
                    hostId: v.hostId,
                    viewId: v.viewId,
                    parentId: v.parentId,
                    componentId: v.componentId,
                    hidden: true,
                    type: v.type,
                };
                if (v.flexStyle) {
                    hiddenInfo['flexStyle'] = {};
                }
                return hiddenInfo;
            }
            return v.info();
        }
        var cached = this.keyCache.getCached(v);
        if (cached) {
            this.mergeActionMap(cached, v);
            return {
                key: hash(v.key),
                hostId: v.hostId
            };
        }
        else {
            this.keyCache.setCache(v);
            var ret = v.info();
            ret.key = hash(v.key);
            return ret;
        }
    };
    VC.prototype.mergeActionMap = function (cached, v) {
        if (v.actions) {
            this._actions[cached.viewId] = v.actions;
        }
        if (cached && cached.componentId > 0) {
            this.addComponent(cached.componentId, this.getComponent(cached.componentId));
        }
        if (cached instanceof View && v instanceof View
            && cached.subviews && v.subviews
            && cached.subviews.length === v.subviews.length) {
            for (var i = 0; i < cached.subviews.length; i++) {
                this.mergeActionMap(cached.subviews[i], v.subviews[i]);
            }
        }
        if (isInnerViewsHandler(cached) && isInnerViewsHandler(v)
            && cached.innerViews() instanceof Array && v.innerViews() instanceof Array
            && cached.innerViews().length === v.innerViews().length) {
            var cacheInnerViews = cached.innerViews();
            var innerViews = v.innerViews();
            for (var i = 0; i < cacheInnerViews.length; i++) {
                this.mergeActionMap(cacheInnerViews[i], innerViews[i]);
            }
        }
    };
    VC.prototype.dispatchLayoutByNative = function () {
        this.isLayouting = true;
        var info = this.twiceLayout();
        this.partRenderEnabled = false;
        if (this.twiceRenderViews.length > 0) {
            this.twiceRenderViews = [];
            this.needLayoutAsync();
        }
        this.isLayouting = false;
        return info;
    };
    VC.prototype.twiceLayout = function (component) {
        var info = this.innerLayout(component);
        if (info instanceof Array) {
            this.updateSizeCache(nativeSizeToFitList(info));
            return this.twiceLayout(component);
        }
        else {
            return info;
        }
    };
    VC.prototype.innerLayout = function (component) {
        setCurrentVC(this);
        this._actions = {};
        this._cacheComponentMap = {};
        this.needSizeToFitViews = [];
        var lastKeyCaches = Object.assign({}, this.keyCache.getAllCache());
        var view = component === undefined ? this.layout() : component.layoutView;
        this.traversalView(view);
        var info = this.infoFilter(view);
        if (!this.isViewStable()) {
            this.layoutCount++;
            if (this.layoutCount > 100) {
                throw new Error("程序一直在反复调用layout，出现异常");
            }
            this.keyCache.setAllCache(lastKeyCaches);
            var sizeInfoList = this.needSizeToFitViews.map(function (e) { return e.info(); });
            return sizeInfoList;
        }
        else {
            this.layoutCount = 0;
            this.updateCache(component !== undefined);
            return info;
        }
    };
    VC.prototype.addNeedSizeToFitView = function (view) {
        this.needSizeToFitViews.push(view);
    };
    VC.prototype.updateSizeCache = function (sizeCache) {
        if (sizeCache) {
            for (var key in sizeCache) {
                if (sizeCache.hasOwnProperty(key)) {
                    this._sizeCache[key] = sizeCache[key];
                }
            }
        }
    };
    VC.prototype.traversalView = function (view) {
        var _this = this;
        if (view instanceof View) {
            view.subviews.forEach(function (element) {
                element.parentId = view.viewId;
                _this.traversalView(element);
            });
        }
        if (this.isNeedSizeToFitView(view)) {
            this.needSizeToFitViews.push(view);
        }
        if (isSubItemHandler(view)) {
            view.handleSubItem = function (v) {
                v.parentId = view.viewId;
                _this.traversalView(v);
                return _this.infoFilter(v);
            };
        }
    };
    VC.prototype.isNeedSizeToFitView = function (v) {
        return isSizeToFitInterface(v) && v.isNeedSizeToFit();
    };
    VC.prototype.innerCommandView = function (viewId, commandSet) {
        if (viewId && viewId.length > 0 && commandSet) {
            nativeCommandViewDirectly(this.hostId, [viewId], [commandSet]);
        }
    };
    VC.prototype.updateChildVCFrame = function (frame) {
        for (var _i = 0, _a = Object.keys(this.childrenVC); _i < _a.length; _i++) {
            var key = _a[_i];
            var vc = this.childrenVC[key];
            if (!vc) {
                continue;
            }
            vc.onFrameChanged(frame);
        }
    };
    VC.prototype.dispatchChildLayoutByNative = function (args) {
        if (this.childrenVC[args.vcId]) {
            return this.childrenVC[args.vcId].dispatchLayoutByNative();
        }
        pLogError('找不到对应的childVC');
        return {};
    };
    VC.prototype.innerLayoutChildVCs = function (vcIds, childVCInfoMap) {
        var allNeedSizeToFitViews = [];
        var needRelayoutVCs = [];
        for (var _i = 0, vcIds_1 = vcIds; _i < vcIds_1.length; _i++) {
            var vcid = vcIds_1[_i];
            var childVC = this.childrenVC[vcid];
            if (!childVC) {
                continue;
            }
            var vcInfo = childVC.innerLayout();
            if (vcInfo instanceof Array) {
                allNeedSizeToFitViews.push.apply(allNeedSizeToFitViews, vcInfo);
                needRelayoutVCs.push(vcid);
            }
            else {
                childVCInfoMap[vcid] = vcInfo;
            }
        }
        if (needRelayoutVCs.length > 0) {
            var allSizeResult = nativeSizeToFitList(allNeedSizeToFitViews);
            for (var _a = 0, needRelayoutVCs_1 = needRelayoutVCs; _a < needRelayoutVCs_1.length; _a++) {
                var vcid = needRelayoutVCs_1[_a];
                var childVC = this.childrenVC[vcid];
                if (!childVC) {
                    continue;
                }
                childVC.updateSizeCache(allSizeResult);
            }
            return this.innerLayoutChildVCs(needRelayoutVCs, childVCInfoMap);
        }
    };
    VC.prototype.callChildVCByNative = function (args) {
        var vc = this.childrenVC[args.__vcid__];
        if (vc && vc[args.__method__]) {
            vc[args.__method__](args.params);
        }
    };
    VC.prototype.execMultiViewCommandSet = function (commandArray) {
        var viewIds = [];
        var commands = [];
        for (var _i = 0, commandArray_1 = commandArray; _i < commandArray_1.length; _i++) {
            var commandObject = commandArray_1[_i];
            viewIds.push(commandObject.commandView.viewId);
            commands.push(commandObject.commandSet);
        }
        nativeCommandViewDirectly(this.hostId, viewIds, commands);
    };
    VC.prototype.configVC = function (clz, config) {
        var _this = this;
        if (this.rootVC) {
            return this.rootVC.configVC(clz, config);
        }
        else {
            var childVC = new clz();
            childVC.hostId = this.hostId;
            childVC.context = this.context;
            childVC.rootVC = this;
            if (config) {
                childVC.intentData = config.data;
                childVC.options = config.options || { width: this.width, height: this.height };
            }
            else {
                childVC.options = { width: this.width, height: this.height };
            }
            var vcId_1 = this.childrenId++;
            this.childrenVC[vcId_1] = childVC;
            childVC.needLayout = function () {
                _this.context.sendMessage('vc', 'needChildLayout', { vcId: vcId_1 });
            };
            childVC.needLayoutAsync = function () {
                _this.context.sendMessage('vc', 'needChildLayout', { vcId: vcId_1 });
            };
            return vcId_1;
        }
    };
    VC.prototype.getChildVC = function (vcId) {
        if (this.rootVC) {
            return this.rootVC.childrenVC[vcId];
        }
        else {
            return this.childrenVC[vcId];
        }
    };
    VC.prototype.destroyChildVCByNative = function (params) {
        if (!params || params.vcId === undefined) {
            return;
        }
        if (this.rootVC) {
            delete this.rootVC.childrenVC[params.vcId];
        }
        else {
            delete this.childrenVC[params.vcId];
        }
    };
    VC.prototype.updateCache = function (isPart) {
        if (isPart) {
            if (this._actions) {
                this._partActionMapGroups.unshift(this._actions);
            }
            if (this._cacheComponentMap) {
                this._partComponentMaps.unshift(this._cacheComponentMap);
            }
        }
        else {
            this._partActionMapGroups = [];
            this._partComponentMaps = [];
            this._wholeComponentMap = this._cacheComponentMap;
            this._actionMapGroups.unshift(this._actions);
            if (this._actionMapGroups.length > 20) {
                this.cleanAcionMapGroup(10);
            }
        }
    };
    VC.prototype.addComponent = function (componentId, component) {
        if (this._cacheComponentMap && component) {
            this._cacheComponentMap[componentId] = component;
        }
    };
    VC.prototype.getComponent = function (componentId) {
        var partComponentCached = this._partComponentMaps.find(function (component) {
            return component && component[componentId] !== undefined;
        });
        if (partComponentCached) {
            return partComponentCached[componentId];
        }
        return this._wholeComponentMap[componentId];
    };
    VC.prototype.layoutComponent = function (componentId) {
        if (this.isLayouting) {
            if (PCSEnvironment.isDebug) {
                throw new Error("您的代码在layout()执行过程中调用了layoutComponent，可能会引起死循环，请检查代码并修改");
            }
            this.layoutComponentAsync(componentId);
            return;
        }
        this.context.sendMessage('vc', 'needComponentLayout', { componentId: componentId });
    };
    VC.prototype.layoutComponentAsync = function (componentId) {
        this.context.sendMessage('vc', 'needComponentLayoutAsync', { componentId: componentId });
    };
    VC.prototype.dispatchComponentLayoutByNative = function (args) {
        setCurrentVC(this);
        this.isLayouting = true;
        var component = this.getComponent(args.componentId);
        if (component) {
            var info = this.twiceLayout(component);
            this.isLayouting = false;
            if (info.componentIntercept) {
                component.onLayoutIntercepted();
                return {
                    hostId: info.hostId,
                    viewId: info.viewId,
                    type: info.type,
                    componentId: args.componentId,
                    componentIntercept: true,
                };
            }
            return info;
        }
        pLogError('找不到对应的component');
        return {};
    };
    return VC;
}(PicassoController));

var Increment_ComponentId = 1;
function __generateComponentId() {
    return Increment_ComponentId++;
}
var Component = (function () {
    function Component() {
        this.__componentId = __generateComponentId();
        this.frameChange = false;
        this.interceptWhenFrameChange = false;
        this._currentVC = getCurrentVC();
        if (this._currentVC) {
            this._currentVC.addComponent(this.__componentId, this);
        }
    }
    Object.defineProperty(Component.prototype, "currentVC", {
        get: function () {
            return this._currentVC;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Component.prototype, "lastViewFrame", {
        get: function () {
            if (this.lastView) {
                return this.lastView.frame;
            }
            return undefined;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Component.prototype, "view", {
        get: function () {
            if (!this.lastView) {
                this.lastView = this.layout();
            }
            this.lastView.componentId = this.__componentId;
            return this.lastView;
        },
        enumerable: true,
        configurable: true
    });
    Component.prototype.needLayout = function () {
        if (this._currentVC) {
            this._currentVC.layoutComponent(this.__componentId);
        }
    };
    Component.prototype.onLayoutIntercepted = function () {
    };
    Object.defineProperty(Component.prototype, "layoutView", {
        get: function () {
            var layoutView = this.layout();
            layoutView.componentId = this.__componentId;
            if (this.lastView) {
                if (this.frameChange) {
                    if (this.lastView.frame.x !== layoutView.frame.x || this.lastView.frame.y !== layoutView.frame.y
                        || this.lastView.frame.width !== layoutView.frame.width || this.lastView.frame.height !== layoutView.frame.height) {
                        layoutView.componentIntercept = this.interceptWhenFrameChange;
                    }
                    this.lastView.frame = layoutView.frame;
                }
                else {
                    layoutView.frame = this.lastView.frame;
                }
            }
            return layoutView;
        },
        enumerable: true,
        configurable: true
    });
    return Component;
}());

function clone(obj) {
    if (Array.isArray(obj))
        return obj.slice();
    var keys = Object.keys(obj);
    var result = {};
    for (var _i = 0, keys_1 = keys; _i < keys_1.length; _i++) {
        var key = keys_1[_i];
        if (key === "___objectid___")
            continue;
        result[key] = obj[key];
    }
    return result;
}
function isObject(o) {
    var type = typeof o;
    return o != null && (type === 'object' || type === 'function');
}
function _merge(target, obj, deep) {
    if (!target)
        return {};
    if (obj == null)
        return target;
    var keys = Object.keys(obj);
    if (!keys.length)
        return target;
    var result = target;
    var virgin = false;
    for (var _i = 0, keys_2 = keys; _i < keys_2.length; _i++) {
        var key = keys_2[_i];
        var next = obj[key];
        if (deep && isObject(result[key]) && isObject(next)) {
            next = _merge(result[key], next, deep);
        }
        if (next === undefined || next === result[key])
            continue;
        if (!virgin) {
            virgin = true;
            result = clone(result);
        }
        result[key] = next;
    }
    return result;
}
(function (Immutable) {
    function merge(target, obj) {
        return _merge(target, obj, false);
    }
    Immutable.merge = merge;
    function mergeDeep(target, obj) {
        return _merge(target, obj, true);
    }
    Immutable.mergeDeep = mergeDeep;
    function set(key, value, obj) {
        var sandbox;
        if (typeof obj === "object") {
            sandbox = {};
        }
        else {
            sandbox = [];
        }
        sandbox[key] = value;
        return mergeDeep(obj, sandbox);
    }
    Immutable.set = set;
    function update(obj, updater) {
        var sandbox = {};
        updater(sandbox);
        return mergeDeep(obj, sandbox);
    }
    Immutable.update = update;
    function insert(array, index, value) {
        index = index < array.length && index >= 0 ? index : array.length;
        var result = array.slice();
        result.splice(index, 0, value);
        return result;
    }
    Immutable.insert = insert;
    function remove(array, index) {
        var result = array.slice();
        result.splice(index, 1);
        return result;
    }
    Immutable.remove = remove;
    function range(from, to) {
        if (from === to)
            return [from];
        if (from > to)
            return [];
        var ret = [];
        for (var i = from; i < to + 1; i++) {
            ret.push(i);
        }
        return ret;
    }
    Immutable.range = range;
    function flatten(list, depth) {
        if (depth === void 0) { depth = 10; }
        if (depth === 0)
            return list;
        return list.reduce(function (accumulator, item) {
            if (Array.isArray(item)) {
                accumulator.push.apply(accumulator, flatten(item, depth - 1));
            }
            else {
                accumulator.push(item);
            }
            return accumulator;
        }, []);
    }
    Immutable.flatten = flatten;
})(exports.Immutable || (exports.Immutable = {}));

exports.ActivityIndicator = ActivityIndicator;
exports.Animation = Animation;
exports.AnimationInfo = AnimationInfo;
exports.AnimationView = AnimationView;
exports.BaseView = BaseView;
exports.Button = Button;
exports.CommandAnimationView = CommandAnimationView;
exports.CommandBaseView = CommandBaseView;
exports.CommandInputView = CommandInputView;
exports.CommandListView = CommandListView;
exports.CommandScrollView = CommandScrollView;
exports.CommandTextView = CommandTextView;
exports.Component = Component;
exports.FlexBox = FlexBox;
exports.ImageView = ImageView;
exports.InputView = InputView;
exports.LayoutContainer = LayoutContainer;
exports.ListItem = ListItem;
exports.ListView = ListView;
exports.LoadingView = LoadingView;
exports.ModelCache = ModelCache;
exports.Path = Path;
exports.PicassoController = PicassoController;
exports.PullRefreshView = PullRefreshView;
exports.ScrollView = ScrollView;
exports.Switch = Switch;
exports.TextView = TextView;
exports.VC = VC;
exports.View = View;
exports.addNeedSizeToFitView = addNeedSizeToFitView;
exports.currentHostId = currentHostId;
exports.deleteSharedData = deleteSharedData;
exports.execViewCommand = execViewCommand;
exports.execViewCommandSet = execViewCommandSet;
exports.flayout = flayout;
exports.flex = flex;
exports.flexBox = flexBox;
exports.getCurrentVC = getCurrentVC;
exports.getSharedData = getSharedData;
exports.getVCKeyCache = getVCKeyCache;
exports.hlayout = hlayout;
exports.infoHandler = infoHandler;
exports.innerExecuteViewCommandSet = innerExecuteViewCommandSet;
exports.isViewStable = isViewStable;
exports.log = pLogInfo;
exports.loge = pLogError;
exports.logw = pLogWarning;
exports.needTwiceRender = needTwiceRender;
exports.partRenderEnabled = partRenderEnabled;
exports.setCurrentVC = setCurrentVC;
exports.setSharedData = setSharedData;
exports.setViewAction = setViewAction;
exports.sizeForKey = sizeForKey;
exports.vlayout = vlayout;
