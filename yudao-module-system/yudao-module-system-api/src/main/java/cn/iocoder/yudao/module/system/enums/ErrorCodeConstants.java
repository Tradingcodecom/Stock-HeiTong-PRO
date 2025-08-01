package cn.iocoder.yudao.module.system.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

/**
 * System 错误码枚举类
 *
 * system 系统，使用 1-002-000-000 段
 */
public interface ErrorCodeConstants {

    // ========== AUTH 模块 1-002-000-000 ==========
    ErrorCode AUTH_LOGIN_BAD_CREDENTIALS = new ErrorCode(1_002_000_000, "error.1_002_000_000");
    ErrorCode AUTH_LOGIN_USER_DISABLED = new ErrorCode(1_002_000_001, "error.1_002_000_001");
    ErrorCode AUTH_LOGIN_CAPTCHA_CODE_ERROR = new ErrorCode(1_002_000_004, "error.1_002_000_004");
    ErrorCode AUTH_THIRD_LOGIN_NOT_BIND = new ErrorCode(1_002_000_005, "error.1_002_000_005");
    ErrorCode AUTH_MOBILE_NOT_EXISTS = new ErrorCode(1_002_000_007, "error.1_002_000_007");
    ErrorCode AUTH_REGISTER_CAPTCHA_CODE_ERROR = new ErrorCode(1_002_000_008, "error.1_002_000_008");

    // ========== 菜单模块 1-002-001-000 ==========
    ErrorCode MENU_NAME_DUPLICATE = new ErrorCode(1_002_001_000, "error.1_002_001_000");
    ErrorCode MENU_PARENT_NOT_EXISTS = new ErrorCode(1_002_001_001, "error.1_002_001_001");
    ErrorCode MENU_PARENT_ERROR = new ErrorCode(1_002_001_002, "error.1_002_001_002");
    ErrorCode MENU_NOT_EXISTS = new ErrorCode(1_002_001_003, "error.1_002_001_003");
    ErrorCode MENU_EXISTS_CHILDREN = new ErrorCode(1_002_001_004, "error.1_002_001_004");
    ErrorCode MENU_PARENT_NOT_DIR_OR_MENU = new ErrorCode(1_002_001_005, "error.1_002_001_005");

    // ========== 角色模块 1-002-002-000 ==========
    ErrorCode ROLE_NOT_EXISTS = new ErrorCode(1_002_002_000, "error.1_002_002_000");
    ErrorCode ROLE_NAME_DUPLICATE = new ErrorCode(1_002_002_001, "error.1_002_002_001");
    ErrorCode ROLE_CODE_DUPLICATE = new ErrorCode(1_002_002_002, "error.1_002_002_002");
    ErrorCode ROLE_CAN_NOT_UPDATE_SYSTEM_TYPE_ROLE = new ErrorCode(1_002_002_003, "error.1_002_002_003");
    ErrorCode ROLE_IS_DISABLE = new ErrorCode(1_002_002_004, "error.1_002_002_004");
    ErrorCode ROLE_ADMIN_CODE_ERROR = new ErrorCode(1_002_002_005, "error.1_002_002_005");

    // ========== 用户模块 1-002-003-000 ==========
    ErrorCode USER_USERNAME_EXISTS = new ErrorCode(1_002_003_000, "error.1_002_003_000");
    ErrorCode USER_MOBILE_EXISTS = new ErrorCode(1_002_003_001, "error.1_002_003_001");
    ErrorCode USER_EMAIL_EXISTS = new ErrorCode(1_002_003_002, "error.1_002_003_002");
    ErrorCode USER_NOT_EXISTS = new ErrorCode(1_002_003_003, "error.1_002_003_003");
    ErrorCode USER_IMPORT_LIST_IS_EMPTY = new ErrorCode(1_002_003_004, "error.1_002_003_004");
    ErrorCode USER_PASSWORD_FAILED = new ErrorCode(1_002_003_005, "error.1_002_003_005");
    ErrorCode USER_IS_DISABLE = new ErrorCode(1_002_003_006, "error.1_002_003_006");
    ErrorCode USER_COUNT_MAX = new ErrorCode(1_002_003_008, "error.1_002_003_008");
    ErrorCode USER_IMPORT_INIT_PASSWORD = new ErrorCode(1_002_003_009, "error.1_002_003_009");
    ErrorCode USER_MOBILE_NOT_EXISTS = new ErrorCode(1_002_003_010, "error.1_002_003_010");

    // ========== 部门模块 1-002-004-000 ==========
    ErrorCode DEPT_NAME_DUPLICATE = new ErrorCode(1_002_004_000, "error.1_002_004_000");
    ErrorCode DEPT_PARENT_NOT_EXITS = new ErrorCode(1_002_004_001, "error.1_002_004_001");
    ErrorCode DEPT_NOT_FOUND = new ErrorCode(1_002_004_002, "error.1_002_004_002");
    ErrorCode DEPT_EXITS_CHILDREN = new ErrorCode(1_002_004_003, "error.1_002_004_003");
    ErrorCode DEPT_PARENT_ERROR = new ErrorCode(1_002_004_004, "error.1_002_004_004");
    ErrorCode DEPT_NOT_ENABLE = new ErrorCode(1_002_004_006, "error.1_002_004_006");
    ErrorCode DEPT_PARENT_IS_CHILD = new ErrorCode(1_002_004_007, "error.1_002_004_007");

    // ========== 岗位模块 1-002-005-000 ==========
    ErrorCode POST_NOT_FOUND = new ErrorCode(1_002_005_000, "error.1_002_005_000");
    ErrorCode POST_NOT_ENABLE = new ErrorCode(1_002_005_001, "error.1_002_005_001");
    ErrorCode POST_NAME_DUPLICATE = new ErrorCode(1_002_005_002, "error.1_002_005_002");
    ErrorCode POST_CODE_DUPLICATE = new ErrorCode(1_002_005_003, "error.1_002_005_003");

    // ========== 字典类型 1-002-006-000 ==========
    ErrorCode DICT_TYPE_NOT_EXISTS = new ErrorCode(1_002_006_001, "error.1_002_006_001");
    ErrorCode DICT_TYPE_NOT_ENABLE = new ErrorCode(1_002_006_002, "error.1_002_006_002");
    ErrorCode DICT_TYPE_NAME_DUPLICATE = new ErrorCode(1_002_006_003, "error.1_002_006_003");
    ErrorCode DICT_TYPE_TYPE_DUPLICATE = new ErrorCode(1_002_006_004, "error.1_002_006_004");
    ErrorCode DICT_TYPE_HAS_CHILDREN = new ErrorCode(1_002_006_005, "error.1_002_006_005");

    // ========== 字典数据 1-002-007-000 ==========
    ErrorCode DICT_DATA_NOT_EXISTS = new ErrorCode(1_002_007_001, "error.1_002_007_001");
    ErrorCode DICT_DATA_NOT_ENABLE = new ErrorCode(1_002_007_002, "error.1_002_007_002");
    ErrorCode DICT_DATA_VALUE_DUPLICATE = new ErrorCode(1_002_007_003, "error.1_002_007_003");

    // ========== 通知公告 1-002-008-000 ==========
    ErrorCode NOTICE_NOT_FOUND = new ErrorCode(1_002_008_001, "error.1_002_008_001");

    // ========== 短信渠道 1-002-011-000 ==========
    ErrorCode SMS_CHANNEL_NOT_EXISTS = new ErrorCode(1_002_011_000, "error.1_002_011_000");
    ErrorCode SMS_CHANNEL_DISABLE = new ErrorCode(1_002_011_001, "error.1_002_011_001");
    ErrorCode SMS_CHANNEL_HAS_CHILDREN = new ErrorCode(1_002_011_002, "error.1_002_011_002");

    // ========== 短信模板 1-002-012-000 ==========
    ErrorCode SMS_TEMPLATE_NOT_EXISTS = new ErrorCode(1_002_012_000, "error.1_002_012_000");
    ErrorCode SMS_TEMPLATE_CODE_DUPLICATE = new ErrorCode(1_002_012_001, "error.1_002_012_001");
    ErrorCode SMS_TEMPLATE_API_ERROR = new ErrorCode(1_002_012_002, "error.1_002_012_002");
    ErrorCode SMS_TEMPLATE_API_AUDIT_CHECKING = new ErrorCode(1_002_012_003, "error.1_002_012_003");
    ErrorCode SMS_TEMPLATE_API_AUDIT_FAIL = new ErrorCode(1_002_012_004, "error.1_002_012_004");
    ErrorCode SMS_TEMPLATE_API_NOT_FOUND = new ErrorCode(1_002_012_005, "error.1_002_012_005");

    // ========== 短信发送 1-002-013-000 ==========
    ErrorCode SMS_SEND_MOBILE_NOT_EXISTS = new ErrorCode(1_002_013_000, "error.1_002_013_000");
    ErrorCode SMS_SEND_MOBILE_TEMPLATE_PARAM_MISS = new ErrorCode(1_002_013_001, "error.1_002_013_001");
    ErrorCode SMS_SEND_TEMPLATE_NOT_EXISTS = new ErrorCode(1_002_013_002, "error.1_002_013_002");

    // ========== 短信验证码 1-002-014-000 ==========
    ErrorCode SMS_CODE_NOT_FOUND = new ErrorCode(1_002_014_000, "error.1_002_014_000");
    ErrorCode SMS_CODE_EXPIRED = new ErrorCode(1_002_014_001, "error.1_002_014_001");
    ErrorCode SMS_CODE_USED = new ErrorCode(1_002_014_002, "error.1_002_014_002");
    ErrorCode SMS_CODE_EXCEED_SEND_MAXIMUM_QUANTITY_PER_DAY = new ErrorCode(1_002_014_004, "error.1_002_014_004");
    ErrorCode SMS_CODE_SEND_TOO_FAST = new ErrorCode(1_002_014_005, "error.1_002_014_005");

    // ========== 租户信息 1-002-015-000 ==========
    ErrorCode TENANT_NOT_EXISTS = new ErrorCode(1_002_015_000, "error.1_002_015_000");
    ErrorCode TENANT_DISABLE = new ErrorCode(1_002_015_001, "error.1_002_015_001");
    ErrorCode TENANT_EXPIRE = new ErrorCode(1_002_015_002, "error.1_002_015_002");
    ErrorCode TENANT_CAN_NOT_UPDATE_SYSTEM = new ErrorCode(1_002_015_003, "error.1_002_015_003");
    ErrorCode TENANT_NAME_DUPLICATE = new ErrorCode(1_002_015_004, "error.1_002_015_004");
    ErrorCode TENANT_WEBSITE_DUPLICATE = new ErrorCode(1_002_015_005, "error.1_002_015_005");

    // ========== 租户套餐 1-002-016-000 ==========
    ErrorCode TENANT_PACKAGE_NOT_EXISTS = new ErrorCode(1_002_016_000, "error.1_002_016_000");
    ErrorCode TENANT_PACKAGE_USED = new ErrorCode(1_002_016_001, "error.1_002_016_001");
    ErrorCode TENANT_PACKAGE_DISABLE = new ErrorCode(1_002_016_002, "error.1_002_016_002");
    ErrorCode TENANT_PACKAGE_NAME_DUPLICATE = new ErrorCode(1_002_016_003, "error.1_002_016_003");

    // ========== 社交用户 1-002-018-000 ==========
    ErrorCode SOCIAL_USER_AUTH_FAILURE = new ErrorCode(1_002_018_000, "error.1_002_018_000");
    ErrorCode SOCIAL_USER_NOT_FOUND = new ErrorCode(1_002_018_001, "error.1_002_018_001");

    // ========== 社交用户 1-002-018-000 ==========
    ErrorCode SOCIAL_CLIENT_WEIXIN_MINI_APP_PHONE_CODE_ERROR = new ErrorCode(1_002_018_200, "error.1_002_018_200");
    ErrorCode SOCIAL_CLIENT_WEIXIN_MINI_APP_QRCODE_ERROR = new ErrorCode(1_002_018_201, "error.1_002_018_201");
    ErrorCode SOCIAL_CLIENT_WEIXIN_MINI_APP_SUBSCRIBE_TEMPLATE_ERROR = new ErrorCode(1_002_018_202, "error.1_002_018_202");
    ErrorCode SOCIAL_CLIENT_WEIXIN_MINI_APP_SUBSCRIBE_MESSAGE_ERROR = new ErrorCode(1_002_018_203, "error.1_002_018_203");
    ErrorCode SOCIAL_CLIENT_NOT_EXISTS = new ErrorCode(1_002_018_210, "error.1_002_018_210");
    ErrorCode SOCIAL_CLIENT_UNIQUE = new ErrorCode(1_002_018_211, "error.1_002_018_211");

    // ========== OAuth2 客户端 1-002-020-000 =========
    ErrorCode OAUTH2_CLIENT_NOT_EXISTS = new ErrorCode(1_002_020_000, "error.1_002_020_000");
    ErrorCode OAUTH2_CLIENT_EXISTS = new ErrorCode(1_002_020_001, "error.1_002_020_001");
    ErrorCode OAUTH2_CLIENT_DISABLE = new ErrorCode(1_002_020_002, "error.1_002_020_002");
    ErrorCode OAUTH2_CLIENT_AUTHORIZED_GRANT_TYPE_NOT_EXISTS = new ErrorCode(1_002_020_003, "error.1_002_020_003");
    ErrorCode OAUTH2_CLIENT_SCOPE_OVER = new ErrorCode(1_002_020_004, "error.1_002_020_004");
    ErrorCode OAUTH2_CLIENT_REDIRECT_URI_NOT_MATCH = new ErrorCode(1_002_020_005, "error.1_002_020_005");
    ErrorCode OAUTH2_CLIENT_CLIENT_SECRET_ERROR = new ErrorCode(1_002_020_006, "error.1_002_020_006");

    // ========== OAuth2 授权 1-002-021-000 =========
    ErrorCode OAUTH2_GRANT_CLIENT_ID_MISMATCH = new ErrorCode(1_002_021_000, "error.1_002_021_000");
    ErrorCode OAUTH2_GRANT_REDIRECT_URI_MISMATCH = new ErrorCode(1_002_021_001, "error.1_002_021_001");
    ErrorCode OAUTH2_GRANT_STATE_MISMATCH = new ErrorCode(1_002_021_002, "error.1_002_021_002");

    // ========== OAuth2 授权 1-002-022-000 =========
    ErrorCode OAUTH2_CODE_NOT_EXISTS = new ErrorCode(1_002_022_000, "error.1_002_022_000");
    ErrorCode OAUTH2_CODE_EXPIRE = new ErrorCode(1_002_022_001, "error.1_002_022_001");

    // ========== 邮箱账号 1-002-023-000 ==========
    ErrorCode MAIL_ACCOUNT_NOT_EXISTS = new ErrorCode(1_002_023_000, "error.1_002_023_000");
    ErrorCode MAIL_ACCOUNT_RELATE_TEMPLATE_EXISTS = new ErrorCode(1_002_023_001, "error.1_002_023_001");

    // ========== 邮件模版 1-002-024-000 ==========
    ErrorCode MAIL_TEMPLATE_NOT_EXISTS = new ErrorCode(1_002_024_000, "error.1_002_024_000");
    ErrorCode MAIL_TEMPLATE_CODE_EXISTS = new ErrorCode(1_002_024_001, "error.1_002_024_001");

    // ========== 邮件发送 1-002-025-000 ==========
    ErrorCode MAIL_SEND_TEMPLATE_PARAM_MISS = new ErrorCode(1_002_025_000, "error.1_002_025_000");
    ErrorCode MAIL_SEND_MAIL_NOT_EXISTS = new ErrorCode(1_002_025_001, "error.1_002_025_001");
    ErrorCode MAIL_CODE_NOT_FOUND = new ErrorCode(1_002_025_002, "error.1_002_025_002");
    ErrorCode MAIL_CODE_EXPIRED = new ErrorCode(1_002_025_003, "error.1_002_025_003");
    ErrorCode MAIL_CODE_USED = new ErrorCode(1_002_025_004, "error.1_002_025_004");
    ErrorCode MAIL_CODE_EXCEED_SEND_MAXIMUM_QUANTITY_PER_DAY = new ErrorCode(1_002_025_005, "error.1_002_025_005");
    ErrorCode MAIL_CODE_SEND_TOO_FAST = new ErrorCode(1_002_025_006, "error.1_002_025_006");
    ErrorCode MAIL_HOST_CONNECT_FAILURE = new ErrorCode(1_002_025_007, "error.1_002_025_007");


    // ========== 站内信模版 1-002-026-000 ==========
    ErrorCode NOTIFY_TEMPLATE_NOT_EXISTS = new ErrorCode(1_002_026_000, "error.1_002_026_000");
    ErrorCode NOTIFY_TEMPLATE_CODE_DUPLICATE = new ErrorCode(1_002_026_001, "error.1_002_026_001");

    // ========== 站内信模版 1-002-027-000 ==========

    // ========== 站内信发送 1-002-028-000 ==========
    ErrorCode NOTIFY_SEND_TEMPLATE_PARAM_MISS = new ErrorCode(1_002_028_000, "error.1_002_028_000");



    // ========== 后台系统管理 ==========
    ErrorCode CONFIG_NOT_EXISTS = new ErrorCode(1_003_028_001, "系统不存在");

}
