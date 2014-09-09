//package com.nikias.SampleFitNesse;
//
//import fitnesse.ComponentFactory;
//import fitnesse.FitNesse;
//import fitnesse.FitNesseContext;
//import fitnesse.authentication.PromiscuousAuthenticator;
//import fitnesse.html.HtmlPageFactory;
//import fitnesse.responders.ResponderFactory;
//import fitnesse.wiki.FileSystemPage;
//
//public class RunFitNesse {
//	public static void main(String args[]) {
//		RunFitNesse fitnesse = new RunFitNesse();
//		fitnesse.start();
//	}
//
//	private void start() {
//
//		FitNesseContext context;
//		try {
//			context = loadContext();
//			FitNesse fitNesse = new FitNesse(context);
//			fitNesse.applyUpdates();
//			if (fitNesse.start()) {
//				System.out.println("FitNesse started!");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	protected FitNesseContext loadContext() throws Exception {
//		FitNesseContext context = new FitNesseContext();
//		ComponentFactory factory = new ComponentFactory(context.rootPath);
//		context.port = 80;
//		context.rootPath = ".";
//		context.rootPageName = "FitNesseRoot";
//		context.rootPagePath = context.rootPath + "/" + context.rootPageName;
//		context.root = factory.getRootPage(FileSystemPage.makeRoot(
//				context.rootPath, context.rootPagePath));
//		context.responderFactory = new ResponderFactory(context.rootPagePath);
//		context.logger = null;
//		context.authenticator = factory
//				.getAuthenticator(new PromiscuousAuthenticator());
//		context.htmlPageFactory = factory
//				.getHtmlPageFactory(new HtmlPageFactory());
//		
//		context.responderFactory.addResponder("test", InheritClassPathTestResponder.class);
//		context.responderFactory.addResponder("debug", InheritDebugClassPathTestResponder.class);
//
//		String extraOutput = factory
//				.loadResponderPlugins(context.responderFactory);
//		extraOutput += factory.loadWikiWidgetPlugins();
//		extraOutput += factory.loadContentFilter();
//
//		return context;
//	}
//
//	private void printStartMessage(FitNesseContext context) {
//		System.out.println("Verification suite started!");
//		System.out.println(context.toString());
//	}
//}
