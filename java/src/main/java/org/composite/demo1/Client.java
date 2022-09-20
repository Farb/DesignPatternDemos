package org.composite.demo1;

public class Client {
    public static void main(String[] args) {
        Component beijingHeadquarter = new Composite("BeijingHeadquarter");

        Component academicAffairsOffice = new Leaf("AcademicAffairsOffice");
        Component hunanBranchCampus = new Composite("HunanBranchCampus");
        Component administrationOffice = new Leaf("AdministrationOffice");
        beijingHeadquarter.add(academicAffairsOffice);
        beijingHeadquarter.add(hunanBranchCampus);
        beijingHeadquarter.add(administrationOffice);

        Component hunanAcademicAffairsOffice = new Leaf("HunanAcademicAffairsOffice");
        Component changshaTeachingPoint = new Composite("ChangshaTeachingPoint");
        Component xiangtanTeachingPoint = new Composite("XiangtanTeachingPoint");
        Component hunanAdministrationOffice = new Leaf("HunanAdministrationOffice");
        hunanBranchCampus.add(hunanAdministrationOffice);
        hunanBranchCampus.add(hunanAcademicAffairsOffice);
        hunanBranchCampus.add(changshaTeachingPoint);
        hunanBranchCampus.add(xiangtanTeachingPoint);

        Component changshaAcademicAffairsOffice = new Leaf("ChangshaAcademicAffairsOffice");
        Component changshaAdministrationOffice = new Leaf("ChangshaAdministrationOffice");
        changshaTeachingPoint.add(changshaAcademicAffairsOffice);
        changshaTeachingPoint.add(changshaAdministrationOffice);

        Component xiangtanAcademicAffairsOffice = new Leaf("XiangtanAcademicAffairsOffice");
        Component xiangtanAdministrationOffice = new Leaf("XiangtanAdministrationOffice");
        xiangtanTeachingPoint.add(xiangtanAcademicAffairsOffice);
        xiangtanTeachingPoint.add(xiangtanAdministrationOffice);

        beijingHeadquarter.issue("School opens");

        System.out.println("----------");
        changshaTeachingPoint.issue("please pay the book fee.");
    }
}
