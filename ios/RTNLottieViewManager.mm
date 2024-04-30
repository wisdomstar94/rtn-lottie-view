#import <React/RCTLog.h>
#import <React/RCTUIManager.h>
#import <React/RCTViewManager.h>

@interface RTNLottieViewManager : RCTViewManager
@end

@implementation RTNLottieViewManager

RCT_EXPORT_MODULE(RTNLottieView)

RCT_EXPORT_VIEW_PROPERTY(text, NSString)

@end