package com.springboot.users.dto;

import java.util.List;

import com.springboot.users.model.Employee;
import com.springboot.users.model.Project;

public class ProjectDetailsResponse {
    private Project project;
    private List<ProjectAllocationDetails> allocations;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<ProjectAllocationDetails> getAllocations() {
        return allocations;
    }

    public void setAllocations(List<ProjectAllocationDetails> allocations) {
        this.allocations = allocations;
    }

    public static class ProjectAllocationDetails {
        private Employee employee;
        private Integer allocationPercentage;
        private String techStack;

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        public Integer getAllocationPercentage() {
            return allocationPercentage;
        }

        public void setAllocationPercentage(Integer allocationPercentage) {
            this.allocationPercentage = allocationPercentage;
        }

        public String getTechStack() {
            return techStack;
        }

        public void setTechStack(String techStack) {
            this.techStack = techStack;
        }
    }
}

